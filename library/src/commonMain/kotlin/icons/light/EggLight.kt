package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.EggLight: ImageVector
    get() {
        if (_EggLight != null) {
            return _EggLight!!
        }
        _EggLight = ImageVector.Builder(
            name = "Light.EggLight",
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
                moveTo(208f, 152f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                reflectiveCurveTo(208f, 88f, 208f, 152f)
                close()
            }
        }.build()

        return _EggLight!!
    }

@Suppress("ObjectPropertyName")
private var _EggLight: ImageVector? = null
