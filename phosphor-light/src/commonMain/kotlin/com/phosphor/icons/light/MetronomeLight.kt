package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MetronomeLight: ImageVector
    get() {
        if (_MetronomeLight != null) {
            return _MetronomeLight!!
        }
        _MetronomeLight = ImageVector.Builder(
            name = "Light.MetronomeLight",
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
                moveTo(60.34f, 168f)
                lineTo(195.66f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.63f, -10.43f)
                lineToRelative(50.91f, -160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.91f, 40f)
                horizontalLineToRelative(42.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.62f, 5.57f)
                lineToRelative(50.91f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 216f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineTo(208f, 80f)
            }
        }.build()

        return _MetronomeLight!!
    }

@Suppress("ObjectPropertyName")
private var _MetronomeLight: ImageVector? = null
