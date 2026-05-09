package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.TriangleLight: ImageVector
    get() {
        if (_TriangleLight != null) {
            return _TriangleLight!!
        }
        _TriangleLight = ImageVector.Builder(
            name = "Light.TriangleLight",
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
                moveTo(142.41f, 40.22f)
                lineToRelative(87.46f, 151.87f)
                curveTo(236f, 202.79f, 228.08f, 216f, 215.46f, 216f)
                horizontalLineTo(40.54f)
                curveTo(27.92f, 216f, 20f, 202.79f, 26.13f, 192.09f)
                lineTo(113.59f, 40.22f)
                curveTo(119.89f, 29.26f, 136.11f, 29.26f, 142.41f, 40.22f)
                close()
            }
        }.build()

        return _TriangleLight!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleLight: ImageVector? = null
