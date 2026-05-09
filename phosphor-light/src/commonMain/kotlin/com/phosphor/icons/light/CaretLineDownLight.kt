package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CaretLineDownLight: ImageVector
    get() {
        if (_CaretLineDownLight != null) {
            return _CaretLineDownLight!!
        }
        _CaretLineDownLight = ImageVector.Builder(
            name = "Light.CaretLineDownLight",
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
                moveTo(208f, 72f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 192f)
                lineTo(208f, 192f)
            }
        }.build()

        return _CaretLineDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineDownLight: ImageVector? = null
