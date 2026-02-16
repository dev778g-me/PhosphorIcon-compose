package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.MapTrifoldLight: ImageVector
    get() {
        if (_MapTrifoldLight != null) {
            return _MapTrifoldLight!!
        }
        _MapTrifoldLight = ImageVector.Builder(
            name = "Light.MapTrifoldLight",
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
                moveTo(96f, 184f)
                lineTo(96f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 72f)
                lineTo(160f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 184f)
                lineToRelative(-64f, 16f)
                lineToRelative(0f, -144f)
                lineToRelative(64f, -16f)
                lineToRelative(64f, 32f)
                lineToRelative(64f, -16f)
                lineToRelative(0f, 144f)
                lineToRelative(-64f, 16f)
                lineToRelative(-64f, -32f)
                close()
            }
        }.build()

        return _MapTrifoldLight!!
    }

@Suppress("ObjectPropertyName")
private var _MapTrifoldLight: ImageVector? = null
