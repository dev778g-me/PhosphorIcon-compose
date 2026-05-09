package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.NumberOneLight: ImageVector
    get() {
        if (_NumberOneLight != null) {
            return _NumberOneLight!!
        }
        _NumberOneLight = ImageVector.Builder(
            name = "Light.NumberOneLight",
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
                moveTo(96f, 72f)
                lineToRelative(40f, -24f)
                lineToRelative(0f, 160f)
            }
        }.build()

        return _NumberOneLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberOneLight: ImageVector? = null
