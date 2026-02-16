package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ScribbleLoopLight: ImageVector
    get() {
        if (_ScribbleLoopLight != null) {
            return _ScribbleLoopLight!!
        }
        _ScribbleLoopLight = ImageVector.Builder(
            name = "Light.ScribbleLoopLight",
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
                moveTo(32f, 92.8f)
                reflectiveCurveTo(64f, 48f, 112f, 48f)
                curveToRelative(104f, 0f, 92.6f, 160f, -3.4f, 160f)
                curveToRelative(-64f, 0f, -64f, -96f, 32f, -96f)
                curveToRelative(64f, 0f, 107.4f, 48f, 107.4f, 48f)
            }
        }.build()

        return _ScribbleLoopLight!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleLoopLight: ImageVector? = null
