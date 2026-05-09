package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.GreaterThanOrEqualLight: ImageVector
    get() {
        if (_GreaterThanOrEqualLight != null) {
            return _GreaterThanOrEqualLight!!
        }
        _GreaterThanOrEqualLight = ImageVector.Builder(
            name = "Light.GreaterThanOrEqualLight",
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
                moveTo(56f, 48f)
                lineToRelative(152f, 56f)
                lineToRelative(-152f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 200f)
                lineTo(56f, 200f)
            }
        }.build()

        return _GreaterThanOrEqualLight!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanOrEqualLight: ImageVector? = null
