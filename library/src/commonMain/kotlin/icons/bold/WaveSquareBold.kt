package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.WaveSquareBold: ImageVector
    get() {
        if (_WaveSquareBold != null) {
            return _WaveSquareBold!!
        }
        _WaveSquareBold = ImageVector.Builder(
            name = "Bold.WaveSquareBold",
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
                moveTo(232f, 128f)
                lineToRelative(0f, 56f)
                lineToRelative(-104f, 0f)
                lineToRelative(0f, -112f)
                lineToRelative(-104f, 0f)
                lineToRelative(0f, 56f)
            }
        }.build()

        return _WaveSquareBold!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSquareBold: ImageVector? = null
