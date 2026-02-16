package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ToothBold: ImageVector
    get() {
        if (_ToothBold != null) {
            return _ToothBold!!
        }
        _ToothBold = ImageVector.Builder(
            name = "Bold.ToothBold",
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
                moveTo(88f, 72f)
                lineTo(168f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 72f)
                lineTo(88f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 79.76f)
                curveTo(39.93f, 151.18f, 63.48f, 208f, 84f, 222.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, -6f)
                curveTo(98f, 196.31f, 104f, 160f, 128f, 160f)
                reflectiveCurveToRelative(30f, 36.31f, 31.51f, 56.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, 6f)
                curveToRelative(20.49f, -14.55f, 44f, -71.36f, 44f, -142.78f)
                arcTo(47.94f, 47.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 32f)
                horizontalLineTo(88f)
                arcTo(47.94f, 47.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 79.76f)
                close()
            }
        }.build()

        return _ToothBold!!
    }

@Suppress("ObjectPropertyName")
private var _ToothBold: ImageVector? = null
