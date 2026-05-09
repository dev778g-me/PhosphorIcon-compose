package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CloudLight: ImageVector
    get() {
        if (_CloudLight != null) {
            return _CloudLight!!
        }
        _CloudLight = ImageVector.Builder(
            name = "Light.CloudLight",
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
                moveTo(80f, 128f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 80f)
                horizontalLineTo(72f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.92f, 97.74f)
            }
        }.build()

        return _CloudLight!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLight: ImageVector? = null
