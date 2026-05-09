package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PowerLight: ImageVector
    get() {
        if (_PowerLight != null) {
            return _PowerLight!!
        }
        _PowerLight = ImageVector.Builder(
            name = "Light.PowerLight",
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
                moveTo(128f, 48f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 56f)
                curveToRelative(24.08f, 15.7f, 40f, 41.11f, 40f, 72f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -176f, 0f)
                curveToRelative(0f, -30.89f, 15.92f, -56.3f, 40f, -72f)
            }
        }.build()

        return _PowerLight!!
    }

@Suppress("ObjectPropertyName")
private var _PowerLight: ImageVector? = null
