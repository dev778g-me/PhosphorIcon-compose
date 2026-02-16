package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ToothDuotone: ImageVector
    get() {
        if (_ToothDuotone != null) {
            return _ToothDuotone!!
        }
        _ToothDuotone = ImageVector.Builder(
            name = "Duotone.ToothDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 64f)
                lineTo(168f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 64f)
                lineTo(88f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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

        return _ToothDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ToothDuotone: ImageVector? = null
