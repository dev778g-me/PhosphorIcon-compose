package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FlagPennantLight: ImageVector
    get() {
        if (_FlagPennantLight != null) {
            return _FlagPennantLight!!
        }
        _FlagPennantLight = ImageVector.Builder(
            name = "Light.FlagPennantLight",
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
                moveTo(56f, 168f)
                lineToRelative(184f, -64f)
                lineToRelative(-184f, -64f)
                lineToRelative(0f, 176f)
            }
        }.build()

        return _FlagPennantLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennantLight: ImageVector? = null
