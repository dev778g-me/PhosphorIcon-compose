package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.MapPinAreaLight: ImageVector
    get() {
        if (_MapPinAreaLight != null) {
            return _MapPinAreaLight!!
        }
        _MapPinAreaLight = ImageVector.Builder(
            name = "Light.MapPinAreaLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 80f)
                moveToRelative(-14f, 0f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 80f)
                curveToRelative(0f, 56f, -56f, 88f, -56f, 88f)
                reflectiveCurveTo(72f, 136f, 72f, 80f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 155.14f)
                curveToRelative(19.72f, 7.28f, 32f, 17.52f, 32f, 28.86f)
                curveToRelative(0f, 22.09f, -46.56f, 40f, -104f, 40f)
                reflectiveCurveTo(24f, 206.09f, 24f, 184f)
                curveToRelative(0f, -11.34f, 12.28f, -21.58f, 32f, -28.86f)
            }
        }.build()

        return _MapPinAreaLight!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinAreaLight: ImageVector? = null
