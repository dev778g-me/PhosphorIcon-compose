package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.HourglassSimpleHighLight: ImageVector
    get() {
        if (_HourglassSimpleHighLight != null) {
            return _HourglassSimpleHighLight!!
        }
        _HourglassSimpleHighLight = ImageVector.Builder(
            name = "Light.HourglassSimpleHighLight",
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
                moveTo(50.36f, 53.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 40f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                lineTo(128f, 128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(50.36f, 202.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 216f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                lineTo(128f, 128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(69.52f, 72f)
                lineTo(186.48f, 72f)
            }
        }.build()

        return _HourglassSimpleHighLight!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassSimpleHighLight: ImageVector? = null
