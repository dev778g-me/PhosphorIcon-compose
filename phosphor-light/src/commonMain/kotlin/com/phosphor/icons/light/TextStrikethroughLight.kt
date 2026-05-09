package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.TextStrikethroughLight: ImageVector
    get() {
        if (_TextStrikethroughLight != null) {
            return _TextStrikethroughLight!!
        }
        _TextStrikethroughLight = ImageVector.Builder(
            name = "Light.TextStrikethroughLight",
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
                moveTo(40f, 128f)
                lineTo(216f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(76.33f, 96f)
                arcToRelative(25.71f, 25.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.22f, -8f)
                curveToRelative(0f, -22.09f, 22f, -40f, 52.89f, -40f)
                curveToRelative(23f, 0f, 40.24f, 9.87f, 48f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 168f)
                curveToRelative(0f, 22.09f, 25.07f, 40f, 56f, 40f)
                reflectiveCurveToRelative(56f, -17.91f, 56f, -40f)
                curveToRelative(0f, -23.77f, -21.62f, -33f, -45.6f, -40f)
            }
        }.build()

        return _TextStrikethroughLight!!
    }

@Suppress("ObjectPropertyName")
private var _TextStrikethroughLight: ImageVector? = null
