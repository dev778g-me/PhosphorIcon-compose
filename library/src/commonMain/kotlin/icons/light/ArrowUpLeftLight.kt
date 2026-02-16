package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ArrowUpLeftLight: ImageVector
    get() {
        if (_ArrowUpLeftLight != null) {
            return _ArrowUpLeftLight!!
        }
        _ArrowUpLeftLight = ImageVector.Builder(
            name = "Light.ArrowUpLeftLight",
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
                moveTo(192f, 192f)
                lineTo(64f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 64f)
                lineToRelative(-104f, 0f)
                lineToRelative(0f, 104f)
            }
        }.build()

        return _ArrowUpLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftLight: ImageVector? = null
