package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PlanetBold: ImageVector
    get() {
        if (_PlanetBold != null) {
            return _PlanetBold!!
        }
        _PlanetBold = ImageVector.Builder(
            name = "Bold.PlanetBold",
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
                moveTo(128f, 128f)
                moveToRelative(-84f, 0f)
                arcToRelative(84f, 84f, 0f, isMoreThanHalf = true, isPositiveArc = true, 168f, 0f)
                arcToRelative(84f, 84f, 0f, isMoreThanHalf = true, isPositiveArc = true, -168f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 62.06f)
                curveToRelative(29.49f, -8.58f, 51.79f, -8.35f, 58.16f, 2.63f)
                curveToRelative(11f, 18.93f, -29.45f, 62.61f, -90.32f, 97.58f)
                reflectiveCurveToRelative(-119.1f, 48f, -130.08f, 29f)
                curveToRelative(-6.4f, -11f, 4.65f, -30.44f, 27f, -51.64f)
            }
        }.build()

        return _PlanetBold!!
    }

@Suppress("ObjectPropertyName")
private var _PlanetBold: ImageVector? = null
