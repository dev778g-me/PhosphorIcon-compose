package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.TentLight: ImageVector
    get() {
        if (_TentLight != null) {
            return _TentLight!!
        }
        _TentLight = ImageVector.Builder(
            name = "Light.TentLight",
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
                moveTo(72f, 48f)
                lineToRelative(-64f, 144f)
                lineToRelative(128f, 0f)
                lineToRelative(-64f, -144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 192f)
                lineToRelative(112f, 0f)
                lineToRelative(-64f, -144f)
                lineToRelative(-112f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _TentLight!!
    }

@Suppress("ObjectPropertyName")
private var _TentLight: ImageVector? = null
