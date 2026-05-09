package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.WaveTriangleLight: ImageVector
    get() {
        if (_WaveTriangleLight != null) {
            return _WaveTriangleLight!!
        }
        _WaveTriangleLight = ImageVector.Builder(
            name = "Light.WaveTriangleLight",
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
                lineToRelative(52f, -72f)
                lineToRelative(104f, 144f)
                lineToRelative(52f, -72f)
            }
        }.build()

        return _WaveTriangleLight!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleLight: ImageVector? = null
