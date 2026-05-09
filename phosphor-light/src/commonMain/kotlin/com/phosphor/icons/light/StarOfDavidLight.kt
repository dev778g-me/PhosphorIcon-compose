package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.StarOfDavidLight: ImageVector
    get() {
        if (_StarOfDavidLight != null) {
            return _StarOfDavidLight!!
        }
        _StarOfDavidLight = ImageVector.Builder(
            name = "Light.StarOfDavidLight",
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
                moveTo(128f, 240f)
                lineToRelative(96f, -168f)
                lineToRelative(-192f, 0.04f)
                lineToRelative(96f, 167.96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 16f)
                lineToRelative(96f, 168f)
                lineToRelative(-192f, -0.04f)
                lineToRelative(96f, -167.96f)
                close()
            }
        }.build()

        return _StarOfDavidLight!!
    }

@Suppress("ObjectPropertyName")
private var _StarOfDavidLight: ImageVector? = null
