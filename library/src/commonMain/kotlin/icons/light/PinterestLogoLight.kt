package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.PinterestLogoLight: ImageVector
    get() {
        if (_PinterestLogoLight != null) {
            return _PinterestLogoLight!!
        }
        _PinterestLogoLight = ImageVector.Builder(
            name = "Light.PinterestLogoLight",
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
                moveTo(128f, 88f)
                lineTo(96f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(66.7f, 152f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 216f, 112f)
                curveToRelative(0f, 44.18f, -32f, 72f, -64f, 72f)
                reflectiveCurveToRelative(-41.63f, -21.07f, -41.63f, -21.07f)
            }
        }.build()

        return _PinterestLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _PinterestLogoLight: ImageVector? = null
