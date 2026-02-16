package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.FlowerLotusLight: ImageVector
    get() {
        if (_FlowerLotusLight != null) {
            return _FlowerLotusLight!!
        }
        _FlowerLotusLight = ImageVector.Builder(
            name = "Light.FlowerLotusLight",
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
                moveTo(128f, 200f)
                reflectiveCurveToRelative(40f, -22f, 40f, -80.82f)
                curveToRelative(0f, -46f, -24.55f, -69.54f, -35.19f, -77.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.62f, 0f)
                curveTo(112.55f, 49.64f, 88f, 73.14f, 88f, 119.18f)
                curveTo(88f, 178f, 128f, 200f, 128f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.6f, 80.8f)
                curveTo(81.28f, 70f, 68.56f, 65.79f, 61f, 64.18f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.52f, 5.52f)
                curveToRelative(-3.88f, 12f, -8.78f, 39.66f, 11.11f, 74.27f)
                reflectiveCurveToRelative(53.07f, 53.4f, 65.37f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(161.4f, 80.8f)
                curveToRelative(13.32f, -10.82f, 26f, -15f, 33.56f, -16.62f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.52f, 5.52f)
                curveToRelative(3.88f, 12f, 8.78f, 39.66f, -11.11f, 74.27f)
                reflectiveCurveTo(140.3f, 197.37f, 128f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 200f)
                curveToRelative(15.37f, 0f, 40.77f, -0.18f, 70f, -17.64f)
                reflectiveCurveToRelative(38.69f, -39.34f, 41.72f, -50.54f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.46f, -9.78f)
                arcToRelative(69.59f, 69.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.82f, -0.64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52.56f, 121.4f)
                arcToRelative(69.59f, 69.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.82f, 0.64f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.46f, 9.78f)
                curveToRelative(3f, 11.2f, 12.49f, 33.07f, 41.72f, 50.54f)
                reflectiveCurveTo(112.63f, 200f, 128f, 200f)
            }
        }.build()

        return _FlowerLotusLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerLotusLight: ImageVector? = null
