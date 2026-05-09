package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PersonSimpleSkiLight: ImageVector
    get() {
        if (_PersonSimpleSkiLight != null) {
            return _PersonSimpleSkiLight!!
        }
        _PersonSimpleSkiLight = ImageVector.Builder(
            name = "Light.PersonSimpleSkiLight",
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
                moveTo(172f, 60f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152.94f, 112.94f)
                lineTo(40f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 120f)
                lineToRelative(-40f, 0f)
                lineToRelative(-32f, -32f)
                lineToRelative(-13.68f, 13.68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 128f)
                lineToRelative(56f, 16f)
                lineToRelative(-39.48f, 39.48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 197.6f)
                arcToRelative(61.94f, 61.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -51.69f, 7.92f)
                lineTo(24f, 160f)
            }
        }.build()

        return _PersonSimpleSkiLight!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSkiLight: ImageVector? = null
