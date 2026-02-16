package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.MaskHappyBold: ImageVector
    get() {
        if (_MaskHappyBold != null) {
            return _MaskHappyBold!!
        }
        _MaskHappyBold = ImageVector.Builder(
            name = "Bold.MaskHappyBold",
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
                moveTo(216f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.89f, -7.47f)
                curveTo(190f, 46.41f, 160.89f, 55.71f, 128f, 55.71f)
                reflectiveCurveToRelative(-62f, -9.3f, -77.11f, -15.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                verticalLineToRelative(55.77f)
                curveTo(40f, 174.6f, 79.4f, 232f, 128f, 232f)
                reflectiveCurveToRelative(88f, -57.4f, 88f, -128.21f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 174.21f)
                arcToRelative(44.94f, 44.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 124.68f)
                arcToRelative(29.59f, 29.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, -2.12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 122.56f)
                arcToRelative(29.61f, 29.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 2.12f)
            }
        }.build()

        return _MaskHappyBold!!
    }

@Suppress("ObjectPropertyName")
private var _MaskHappyBold: ImageVector? = null
