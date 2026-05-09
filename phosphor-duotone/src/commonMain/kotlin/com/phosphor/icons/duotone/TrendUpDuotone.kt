package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TrendUpDuotone: ImageVector
    get() {
        if (_TrendUpDuotone != null) {
            return _TrendUpDuotone!!
        }
        _TrendUpDuotone = ImageVector.Builder(
            name = "Duotone.TrendUpDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(232f, 56f)
                lineToRelative(-64f, 0f)
                lineToRelative(64f, 64f)
                lineToRelative(0f, -64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 120f)
                lineToRelative(0f, -64f)
                lineToRelative(-64f, 0f)
                lineToRelative(64f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 88f)
                lineToRelative(-64f, 64f)
                lineToRelative(-40f, -40f)
                lineToRelative(-72f, 72f)
            }
        }.build()

        return _TrendUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TrendUpDuotone: ImageVector? = null
