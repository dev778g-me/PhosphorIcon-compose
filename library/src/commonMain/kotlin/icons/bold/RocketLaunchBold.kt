package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.RocketLaunchBold: ImageVector
    get() {
        if (_RocketLaunchBold != null) {
            return _RocketLaunchBold!!
        }
        _RocketLaunchBold = ImageVector.Builder(
            name = "Bold.RocketLaunchBold",
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
                moveTo(191.11f, 112.89f)
                curveToRelative(24f, -24f, 25.5f, -52.55f, 24.75f, -65.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.47f, -7.47f)
                curveToRelative(-12.73f, -0.75f, -41.26f, 0.73f, -65.28f, 24.75f)
                lineTo(80f, 128f)
                lineToRelative(48f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 72f)
                horizontalLineTo(74.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.65f, 2.34f)
                lineTo(34.35f, 108.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.53f, 13.57f)
                lineTo(80f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 120f)
                verticalLineToRelative(61.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, 5.65f)
                lineToRelative(-34.35f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.57f, -4.53f)
                lineTo(128f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(90.36f, 194.93f)
                curveTo(83.55f, 204.2f, 69.15f, 216f, 40f, 216f)
                curveToRelative(0f, -29.15f, 11.8f, -43.55f, 21.07f, -50.36f)
            }
        }.build()

        return _RocketLaunchBold!!
    }

@Suppress("ObjectPropertyName")
private var _RocketLaunchBold: ImageVector? = null
