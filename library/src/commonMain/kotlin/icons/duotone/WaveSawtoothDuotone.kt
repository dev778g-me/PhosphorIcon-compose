package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.WaveSawtoothDuotone: ImageVector
    get() {
        if (_WaveSawtoothDuotone != null) {
            return _WaveSawtoothDuotone!!
        }
        _WaveSawtoothDuotone = ImageVector.Builder(
            name = "Duotone.WaveSawtoothDuotone",
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
                moveTo(24f, 128f)
                lineToRelative(104f, -64f)
                lineToRelative(0f, 128f)
                lineToRelative(104f, -64f)
                lineToRelative(-208f, 0f)
                close()
            }
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

        return _WaveSawtoothDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtoothDuotone: ImageVector? = null
