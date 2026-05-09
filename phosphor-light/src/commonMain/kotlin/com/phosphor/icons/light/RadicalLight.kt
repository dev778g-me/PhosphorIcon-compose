package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.RadicalLight: ImageVector
    get() {
        if (_RadicalLight != null) {
            return _RadicalLight!!
        }
        _RadicalLight = ImageVector.Builder(
            name = "Light.RadicalLight",
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
                moveTo(240f, 104f)
                lineToRelative(0f, -24f)
                lineToRelative(-112f, 0f)
                lineToRelative(-48f, 128f)
                lineToRelative(-48f, -128f)
            }
        }.build()

        return _RadicalLight!!
    }

@Suppress("ObjectPropertyName")
private var _RadicalLight: ImageVector? = null
