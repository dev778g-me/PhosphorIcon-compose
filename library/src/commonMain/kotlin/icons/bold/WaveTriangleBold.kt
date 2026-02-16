package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.WaveTriangleBold: ImageVector
    get() {
        if (_WaveTriangleBold != null) {
            return _WaveTriangleBold!!
        }
        _WaveTriangleBold = ImageVector.Builder(
            name = "Bold.WaveTriangleBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                lineToRelative(52f, -72f)
                lineToRelative(104f, 144f)
                lineToRelative(52f, -72f)
            }
        }.build()

        return _WaveTriangleBold!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleBold: ImageVector? = null
