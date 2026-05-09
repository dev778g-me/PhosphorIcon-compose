package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.AirplaneLandingLight: ImageVector
    get() {
        if (_AirplaneLandingLight != null) {
            return _AirplaneLandingLight!!
        }
        _AirplaneLandingLight = ImageVector.Builder(
            name = "Light.AirplaneLandingLight",
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
                moveTo(104f, 216f)
                lineTo(248f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60f, 75.46f)
                lineTo(104f, 88f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.53f, -7.59f)
                lineTo(120f, 42.24f)
                lineToRelative(24f, 57.2f)
                lineToRelative(64.56f, 18f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 148.32f)
                verticalLineTo(184f)
                lineTo(55.37f, 134.54f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 103.73f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.53f, -7.59f)
                lineTo(48f, 42.24f)
                close()
            }
        }.build()

        return _AirplaneLandingLight!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneLandingLight: ImageVector? = null
