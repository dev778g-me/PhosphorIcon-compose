package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.NumberSevenLight: ImageVector
    get() {
        if (_NumberSevenLight != null) {
            return _NumberSevenLight!!
        }
        _NumberSevenLight = ImageVector.Builder(
            name = "Light.NumberSevenLight",
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
                moveTo(88f, 48f)
                lineToRelative(80f, 0f)
                lineToRelative(-48f, 160f)
            }
        }.build()

        return _NumberSevenLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSevenLight: ImageVector? = null
