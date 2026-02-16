package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.PulseLight: ImageVector
    get() {
        if (_PulseLight != null) {
            return _PulseLight!!
        }
        _PulseLight = ImageVector.Builder(
            name = "Light.PulseLight",
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
                moveTo(24f, 128f)
                lineToRelative(32f, 0f)
                lineToRelative(40f, -88f)
                lineToRelative(64f, 168f)
                lineToRelative(40f, -80f)
                lineToRelative(32f, 0f)
            }
        }.build()

        return _PulseLight!!
    }

@Suppress("ObjectPropertyName")
private var _PulseLight: ImageVector? = null
