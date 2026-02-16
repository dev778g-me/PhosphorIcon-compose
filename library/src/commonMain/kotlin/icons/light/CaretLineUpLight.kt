package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.CaretLineUpLight: ImageVector
    get() {
        if (_CaretLineUpLight != null) {
            return _CaretLineUpLight!!
        }
        _CaretLineUpLight = ImageVector.Builder(
            name = "Light.CaretLineUpLight",
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
                moveTo(48f, 192f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 72f)
                lineTo(208f, 72f)
            }
        }.build()

        return _CaretLineUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineUpLight: ImageVector? = null
