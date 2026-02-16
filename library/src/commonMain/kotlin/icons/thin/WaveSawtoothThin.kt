package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.WaveSawtoothThin: ImageVector
    get() {
        if (_WaveSawtoothThin != null) {
            return _WaveSawtoothThin!!
        }
        _WaveSawtoothThin = ImageVector.Builder(
            name = "Thin.WaveSawtoothThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                lineToRelative(104f, -64f)
                lineToRelative(0f, 128f)
                lineToRelative(104f, -64f)
            }
        }.build()

        return _WaveSawtoothThin!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtoothThin: ImageVector? = null
