package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CaretLineLeftLight: ImageVector
    get() {
        if (_CaretLineLeftLight != null) {
            return _CaretLineLeftLight!!
        }
        _CaretLineLeftLight = ImageVector.Builder(
            name = "Light.CaretLineLeftLight",
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
                moveTo(192f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 48f)
                lineTo(72f, 208f)
            }
        }.build()

        return _CaretLineLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineLeftLight: ImageVector? = null
