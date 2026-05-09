package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MinusLight: ImageVector
    get() {
        if (_MinusLight != null) {
            return _MinusLight!!
        }
        _MinusLight = ImageVector.Builder(
            name = "Light.MinusLight",
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
        }.build()

        return _MinusLight!!
    }

@Suppress("ObjectPropertyName")
private var _MinusLight: ImageVector? = null
