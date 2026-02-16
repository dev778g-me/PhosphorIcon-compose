package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.SigmaLight: ImageVector
    get() {
        if (_SigmaLight != null) {
            return _SigmaLight!!
        }
        _SigmaLight = ImageVector.Builder(
            name = "Light.SigmaLight",
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
                moveTo(192f, 72f)
                lineToRelative(0f, -24f)
                lineToRelative(-128f, 0f)
                lineToRelative(64f, 80f)
                lineToRelative(-64f, 80f)
                lineToRelative(128f, 0f)
                lineToRelative(0f, -24f)
            }
        }.build()

        return _SigmaLight!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaLight: ImageVector? = null
