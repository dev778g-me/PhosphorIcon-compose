package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.TrendDownDuotone: ImageVector
    get() {
        if (_TrendDownDuotone != null) {
            return _TrendDownDuotone!!
        }
        _TrendDownDuotone = ImageVector.Builder(
            name = "Duotone.TrendDownDuotone",
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
                moveTo(232f, 128f)
                lineToRelative(0f, 64f)
                lineToRelative(-64f, 0f)
                lineToRelative(64f, -64f)
                close()
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
                lineToRelative(64f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 160f)
                lineToRelative(-64f, -64f)
                lineToRelative(-40f, 40f)
                lineToRelative(-72f, -72f)
            }
        }.build()

        return _TrendDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TrendDownDuotone: ImageVector? = null
