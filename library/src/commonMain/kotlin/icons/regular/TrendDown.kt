package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.TrendDown: ImageVector
    get() {
        if (_TrendDown != null) {
            return _TrendDown!!
        }
        _TrendDown = ImageVector.Builder(
            name = "Regular.TrendDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 192f)
                lineToRelative(-96f, -96f)
                lineToRelative(-40f, 40f)
                lineToRelative(-72f, -72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 128f)
                lineToRelative(0f, 64f)
                lineToRelative(-64f, 0f)
            }
        }.build()

        return _TrendDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendDown: ImageVector? = null
