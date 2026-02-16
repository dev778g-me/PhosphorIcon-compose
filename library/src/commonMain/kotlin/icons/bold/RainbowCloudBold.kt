package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.RainbowCloudBold: ImageVector
    get() {
        if (_RainbowCloudBold != null) {
            return _RainbowCloudBold!!
        }
        _RainbowCloudBold = ImageVector.Builder(
            name = "Bold.RainbowCloudBold",
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
                moveTo(156f, 200f)
                curveToRelative(-13.25f, 0f, -24f, -11.14f, -24f, -24.89f)
                reflectiveCurveToRelative(10.75f, -24.89f, 24f, -24.89f)
                arcToRelative(23.33f, 23.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 1.73f)
                horizontalLineToRelative(0f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 204f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 176f)
                verticalLineTo(160f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.74f, -15.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52f, 176f)
                verticalLineTo(160f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.83f, -51.48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 176f)
                verticalLineTo(160f)
                arcTo(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = true, 177.59f, 84.52f)
            }
        }.build()

        return _RainbowCloudBold!!
    }

@Suppress("ObjectPropertyName")
private var _RainbowCloudBold: ImageVector? = null
