package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.TidalLogoLight: ImageVector
    get() {
        if (_TidalLogoLight != null) {
            return _TidalLogoLight!!
        }
        _TidalLogoLight = ImageVector.Builder(
            name = "Light.TidalLogoLight",
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
                moveTo(8.01f, 96f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.01f, 96f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.01f, 176f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168.01f, 96f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
        }.build()

        return _TidalLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _TidalLogoLight: ImageVector? = null
