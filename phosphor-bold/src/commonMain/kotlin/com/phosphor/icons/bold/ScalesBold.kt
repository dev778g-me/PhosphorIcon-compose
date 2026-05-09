package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ScalesBold: ImageVector
    get() {
        if (_ScalesBold != null) {
            return _ScalesBold!!
        }
        _ScalesBold = ImageVector.Builder(
            name = "Bold.ScalesBold",
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
                moveTo(128f, 40f)
                lineTo(128f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 216f)
                lineTo(152f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 88f)
                lineTo(200f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 168f)
                curveToRelative(0f, 17.67f, 20f, 24f, 32f, 24f)
                reflectiveCurveToRelative(32f, -6.33f, 32f, -24f)
                lineTo(56f, 88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 136f)
                curveToRelative(0f, 17.67f, 20f, 24f, 32f, 24f)
                reflectiveCurveToRelative(32f, -6.33f, 32f, -24f)
                lineTo(200f, 56f)
                close()
            }
        }.build()

        return _ScalesBold!!
    }

@Suppress("ObjectPropertyName")
private var _ScalesBold: ImageVector? = null
