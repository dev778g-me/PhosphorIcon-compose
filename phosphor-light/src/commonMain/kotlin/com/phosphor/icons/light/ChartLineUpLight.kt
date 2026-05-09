package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ChartLineUpLight: ImageVector
    get() {
        if (_ChartLineUpLight != null) {
            return _ChartLineUpLight!!
        }
        _ChartLineUpLight = ImageVector.Builder(
            name = "Light.ChartLineUpLight",
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
                moveTo(224f, 208f)
                lineToRelative(-192f, 0f)
                lineToRelative(0f, -160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 72f)
                lineToRelative(-72f, 72f)
                lineToRelative(-32f, -32f)
                lineToRelative(-64f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 112f)
                lineToRelative(0f, -40f)
                lineToRelative(-40f, 0f)
            }
        }.build()

        return _ChartLineUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineUpLight: ImageVector? = null
