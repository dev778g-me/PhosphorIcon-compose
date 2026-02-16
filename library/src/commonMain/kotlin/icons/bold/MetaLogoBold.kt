package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.MetaLogoBold: ImageVector
    get() {
        if (_MetaLogoBold != null) {
            return _MetaLogoBold!!
        }
        _MetaLogoBold = ImageVector.Builder(
            name = "Bold.MetaLogoBold",
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
                moveTo(105.11f, 155.55f)
                curveTo(90.66f, 180.34f, 75.67f, 200f, 58.56f, 200f)
                curveTo(-3.16f, 200f, 27.7f, 56f, 74f, 56f)
                reflectiveCurveToRelative(77.15f, 144f, 123.45f, 144f)
                curveTo(259.16f, 200f, 228.3f, 56f, 182f, 56f)
                curveToRelative(-10.65f, 0f, -20.47f, 7.61f, -29.86f, 19.33f)
            }
        }.build()

        return _MetaLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _MetaLogoBold: ImageVector? = null
