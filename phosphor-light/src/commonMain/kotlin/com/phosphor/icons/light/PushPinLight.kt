package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PushPinLight: ImageVector
    get() {
        if (_PushPinLight != null) {
            return _PushPinLight!!
        }
        _PushPinLight = ImageVector.Builder(
            name = "Light.PushPinLight",
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
                moveTo(229.66f, 98.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.31f)
                lineTo(169f, 26.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 0f)
                lineTo(100.39f, 83.8f)
                reflectiveCurveTo(72.64f, 69.93f, 43f, 93.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.65f, 11.91f)
                lineToRelative(107.9f, 107.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -0.83f)
                curveToRelative(8.39f, -11.16f, 21.57f, -34.09f, 10.11f, -57f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.29f, 159.71f)
                lineTo(48f, 208f)
            }
        }.build()

        return _PushPinLight!!
    }

@Suppress("ObjectPropertyName")
private var _PushPinLight: ImageVector? = null
