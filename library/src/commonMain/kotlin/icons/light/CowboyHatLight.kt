package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.CowboyHatLight: ImageVector
    get() {
        if (_CowboyHatLight != null) {
            return _CowboyHatLight!!
        }
        _CowboyHatLight = ImageVector.Builder(
            name = "Light.CowboyHatLight",
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
                moveTo(40f, 128f)
                curveToRelative(40f, 64f, 88f, 64f, 88f, 64f)
                reflectiveCurveToRelative(48f, 0f, 88f, -64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 64f)
                horizontalLineTo(40f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(65.47f, 160.18f)
                lineTo(85.54f, 54.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.4f, 49.76f)
                lineTo(123f, 70.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                lineToRelative(24.6f, -20.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.86f, 4.77f)
                lineToRelative(20.07f, 105.65f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(70.06f, 136f)
                lineTo(185.94f, 136f)
            }
        }.build()

        return _CowboyHatLight!!
    }

@Suppress("ObjectPropertyName")
private var _CowboyHatLight: ImageVector? = null
