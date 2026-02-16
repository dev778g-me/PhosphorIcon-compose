package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.SkipBackLight: ImageVector
    get() {
        if (_SkipBackLight != null) {
            return _SkipBackLight!!
        }
        _SkipBackLight = ImageVector.Builder(
            name = "Light.SkipBackLight",
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
                moveTo(56f, 40f)
                lineTo(56f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 47.88f)
                verticalLineTo(208.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.19f, 6.65f)
                lineTo(59.7f, 134.65f)
                arcToRelative(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -13.3f)
                lineTo(187.81f, 41.23f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 47.88f)
                close()
            }
        }.build()

        return _SkipBackLight!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBackLight: ImageVector? = null
