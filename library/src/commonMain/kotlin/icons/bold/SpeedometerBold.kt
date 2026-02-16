package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SpeedometerBold: ImageVector
    get() {
        if (_SpeedometerBold != null) {
            return _SpeedometerBold!!
        }
        _SpeedometerBold = ImageVector.Builder(
            name = "Bold.SpeedometerBold",
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
                moveTo(128f, 152f)
                lineTo(216f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 152f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
                arcToRelative(65.75f, 65.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.05f, 0.38f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224.19f, 112.38f)
                arcToRelative(104.48f, 104.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.91f, 74.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.57f, 5.37f)
                horizontalLineTo(37.46f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.57f, -5.41f)
                arcTo(104.06f, 104.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 151.19f)
                curveTo(24.44f, 94f, 71.73f, 47.49f, 129f, 48f)
                arcToRelative(103.77f, 103.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.66f, 7.81f)
            }
        }.build()

        return _SpeedometerBold!!
    }

@Suppress("ObjectPropertyName")
private var _SpeedometerBold: ImageVector? = null
