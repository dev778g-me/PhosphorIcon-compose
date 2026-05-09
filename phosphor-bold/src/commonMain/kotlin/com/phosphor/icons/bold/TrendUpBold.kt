package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TrendUpBold: ImageVector
    get() {
        if (_TrendUpBold != null) {
            return _TrendUpBold!!
        }
        _TrendUpBold = ImageVector.Builder(
            name = "Bold.TrendUpBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 56f)
                lineToRelative(-96f, 96f)
                lineToRelative(-40f, -40f)
                lineToRelative(-72f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 120f)
                lineToRelative(0f, -64f)
                lineToRelative(-64f, 0f)
            }
        }.build()

        return _TrendUpBold!!
    }

@Suppress("ObjectPropertyName")
private var _TrendUpBold: ImageVector? = null
