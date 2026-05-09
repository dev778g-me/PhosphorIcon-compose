package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CherriesLight: ImageVector
    get() {
        if (_CherriesLight != null) {
            return _CherriesLight!!
        }
        _CherriesLight = ImageVector.Builder(
            name = "Light.CherriesLight",
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
                moveTo(88f, 160f)
                moveToRelative(-64f, 0f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 136f)
                reflectiveCurveToRelative(-8f, 8f, -24f, 8f)
                reflectiveCurveToRelative(-24f, -8f, -24f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 120f)
                reflectiveCurveToRelative(-8f, 8f, -24f, 8f)
                reflectiveCurveToRelative(-24f, -8f, -24f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 128f)
                curveTo(168f, 16f, 56f, 32f, 56f, 32f)
                curveToRelative(48f, 32f, 32f, 112f, 32f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(123.81f, 107f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.41f, 90.12f)
            }
        }.build()

        return _CherriesLight!!
    }

@Suppress("ObjectPropertyName")
private var _CherriesLight: ImageVector? = null
