package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.WaveSawtoothLight: ImageVector
    get() {
        if (_WaveSawtoothLight != null) {
            return _WaveSawtoothLight!!
        }
        _WaveSawtoothLight = ImageVector.Builder(
            name = "Light.WaveSawtoothLight",
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
                moveTo(24f, 128f)
                lineToRelative(104f, -64f)
                lineToRelative(0f, 128f)
                lineToRelative(104f, -64f)
            }
        }.build()

        return _WaveSawtoothLight!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtoothLight: ImageVector? = null
