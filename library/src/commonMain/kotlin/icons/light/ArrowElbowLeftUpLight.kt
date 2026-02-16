package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ArrowElbowLeftUpLight: ImageVector
    get() {
        if (_ArrowElbowLeftUpLight != null) {
            return _ArrowElbowLeftUpLight!!
        }
        _ArrowElbowLeftUpLight = ImageVector.Builder(
            name = "Light.ArrowElbowLeftUpLight",
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
                moveTo(136f, 96f)
                lineToRelative(-48f, -48f)
                lineToRelative(-48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 192f)
                lineToRelative(-144f, 0f)
                lineToRelative(0f, -144f)
            }
        }.build()

        return _ArrowElbowLeftUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftUpLight: ImageVector? = null
