package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ControlLight: ImageVector
    get() {
        if (_ControlLight != null) {
            return _ControlLight!!
        }
        _ControlLight = ImageVector.Builder(
            name = "Light.ControlLight",
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
                moveTo(56f, 120f)
                lineToRelative(72f, -72f)
                lineToRelative(72f, 72f)
            }
        }.build()

        return _ControlLight!!
    }

@Suppress("ObjectPropertyName")
private var _ControlLight: ImageVector? = null
