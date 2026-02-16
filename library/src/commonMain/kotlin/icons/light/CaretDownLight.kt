package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.CaretDownLight: ImageVector
    get() {
        if (_CaretDownLight != null) {
            return _CaretDownLight!!
        }
        _CaretDownLight = ImageVector.Builder(
            name = "Light.CaretDownLight",
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
                moveTo(208f, 96f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
        }.build()

        return _CaretDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDownLight: ImageVector? = null
