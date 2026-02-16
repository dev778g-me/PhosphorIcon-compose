package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ArrowElbowRightUpLight: ImageVector
    get() {
        if (_ArrowElbowRightUpLight != null) {
            return _ArrowElbowRightUpLight!!
        }
        _ArrowElbowRightUpLight = ImageVector.Builder(
            name = "Light.ArrowElbowRightUpLight",
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
                moveTo(120f, 96f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 192f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, -144f)
            }
        }.build()

        return _ArrowElbowRightUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightUpLight: ImageVector? = null
