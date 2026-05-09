package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BarricadeLight: ImageVector
    get() {
        if (_BarricadeLight != null) {
            return _BarricadeLight!!
        }
        _BarricadeLight = ImageVector.Builder(
            name = "Light.BarricadeLight",
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
                moveTo(32f, 72f)
                lineTo(224f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80f)
                lineTo(232f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 160f)
                lineTo(32f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 152f)
                lineTo(24f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84f, 72f)
                lineTo(172f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 72f)
                lineTo(232f, 148f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 84f)
                lineTo(100f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 160f)
                lineTo(192f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 160f)
                lineTo(64f, 200f)
            }
        }.build()

        return _BarricadeLight!!
    }

@Suppress("ObjectPropertyName")
private var _BarricadeLight: ImageVector? = null
