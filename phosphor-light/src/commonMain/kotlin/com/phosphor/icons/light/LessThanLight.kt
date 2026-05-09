package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.LessThanLight: ImageVector
    get() {
        if (_LessThanLight != null) {
            return _LessThanLight!!
        }
        _LessThanLight = ImageVector.Builder(
            name = "Light.LessThanLight",
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
                moveTo(200f, 56f)
                lineToRelative(-152f, 72f)
                lineToRelative(152f, 72f)
            }
        }.build()

        return _LessThanLight!!
    }

@Suppress("ObjectPropertyName")
private var _LessThanLight: ImageVector? = null
