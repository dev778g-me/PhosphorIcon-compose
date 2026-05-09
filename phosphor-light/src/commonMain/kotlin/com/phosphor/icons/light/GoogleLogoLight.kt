package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.GoogleLogoLight: ImageVector
    get() {
        if (_GoogleLogoLight != null) {
            return _GoogleLogoLight!!
        }
        _GoogleLogoLight = ImageVector.Builder(
            name = "Light.GoogleLogoLight",
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
                moveTo(128f, 128f)
                horizontalLineToRelative(88f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20.11f, -56f)
            }
        }.build()

        return _GoogleLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleLogoLight: ImageVector? = null
