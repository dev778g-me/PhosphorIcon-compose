package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.WaveSawtooth: ImageVector
    get() {
        if (_WaveSawtooth != null) {
            return _WaveSawtooth!!
        }
        _WaveSawtooth = ImageVector.Builder(
            name = "Regular.WaveSawtooth",
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
                moveTo(24f, 128f)
                lineToRelative(104f, -64f)
                lineToRelative(0f, 128f)
                lineToRelative(104f, -64f)
            }
        }.build()

        return _WaveSawtooth!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtooth: ImageVector? = null
