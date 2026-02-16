package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SwimmingPoolBold: ImageVector
    get() {
        if (_SwimmingPoolBold != null) {
            return _SwimmingPoolBold!!
        }
        _SwimmingPoolBold = ImageVector.Builder(
            name = "Bold.SwimmingPoolBold",
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
                moveTo(88f, 52f)
                lineTo(168f, 52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 88f)
                lineTo(168f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 124f)
                lineTo(168f, 124f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 32f)
                lineTo(88f, 137.39f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 32f)
                lineTo(168f, 139.29f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 164f)
                curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 208f)
                curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
            }
        }.build()

        return _SwimmingPoolBold!!
    }

@Suppress("ObjectPropertyName")
private var _SwimmingPoolBold: ImageVector? = null
