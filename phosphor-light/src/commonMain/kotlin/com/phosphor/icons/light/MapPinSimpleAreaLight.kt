package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MapPinSimpleAreaLight: ImageVector
    get() {
        if (_MapPinSimpleAreaLight != null) {
            return _MapPinSimpleAreaLight!!
        }
        _MapPinSimpleAreaLight = ImageVector.Builder(
            name = "Light.MapPinSimpleAreaLight",
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
                moveTo(128f, 64f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineTo(128f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 139.07f)
                curveToRelative(37.58f, 6f, 64f, 20.29f, 64f, 36.93f)
                curveToRelative(0f, 22.09f, -46.56f, 40f, -104f, 40f)
                reflectiveCurveTo(24f, 198.09f, 24f, 176f)
                curveToRelative(0f, -16.64f, 26.42f, -30.91f, 64f, -36.93f)
            }
        }.build()

        return _MapPinSimpleAreaLight!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinSimpleAreaLight: ImageVector? = null
