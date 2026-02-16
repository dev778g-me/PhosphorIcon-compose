package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.TrendUpLight: ImageVector
    get() {
        if (_TrendUpLight != null) {
            return _TrendUpLight!!
        }
        _TrendUpLight = ImageVector.Builder(
            name = "Light.TrendUpLight",
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
                moveTo(232f, 56f)
                lineToRelative(-96f, 96f)
                lineToRelative(-40f, -40f)
                lineToRelative(-72f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 120f)
                lineToRelative(0f, -64f)
                lineToRelative(-64f, 0f)
            }
        }.build()

        return _TrendUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _TrendUpLight: ImageVector? = null
