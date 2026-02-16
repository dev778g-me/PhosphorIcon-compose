package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.GuitarDuotone: ImageVector
    get() {
        if (_GuitarDuotone != null) {
            return _GuitarDuotone!!
        }
        _GuitarDuotone = ImageVector.Builder(
            name = "Duotone.GuitarDuotone",
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
                moveTo(155.2f, 100.8f)
                curveToRelative(-23f, -23f, -55.57f, -27.63f, -72.8f, -10.4f)
                arcToRelative(34.21f, 34.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.61f, 11.66f)
                arcToRelative(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.72f, 10f)
                curveTo(48f, 112.44f, 37f, 116.61f, 28.8f, 124.8f)
                curveTo(7.6f, 146f, 13.33f, 186.12f, 41.6f, 214.4f)
                reflectiveCurveToRelative(68.39f, 34f, 89.6f, 12.8f)
                curveTo(139.39f, 219f, 143.56f, 208f, 144f, 195.93f)
                arcToRelative(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -14.72f)
                arcToRelative(34.21f, 34.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.66f, -7.61f)
                curveTo(182.83f, 156.37f, 178.17f, 123.78f, 155.2f, 100.8f)
                close()
                moveTo(112f, 168f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 168f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(204f, 12f)
                lineTo(244f, 52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 56f)
                lineTo(200f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60.07f, 112f)
                arcToRelative(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.72f, -10f)
                arcTo(34.21f, 34.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.4f, 90.4f)
                curveToRelative(17.23f, -17.23f, 49.82f, -12.57f, 72.8f, 10.4f)
                reflectiveCurveToRelative(27.63f, 55.57f, 10.4f, 72.8f)
                arcToRelative(34.21f, 34.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.66f, 7.61f)
                arcToRelative(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 14.72f)
                curveTo(143.56f, 208f, 139.39f, 219f, 131.2f, 227.2f)
                curveTo(110f, 248.4f, 69.88f, 242.67f, 41.6f, 214.4f)
                reflectiveCurveTo(7.6f, 146f, 28.8f, 124.8f)
                curveTo(37f, 116.61f, 48f, 112.44f, 60.07f, 112f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 168f)
                lineTo(88f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 144f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 120f)
                lineTo(212f, 20f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 144f)
                lineTo(236f, 44f)
            }
        }.build()

        return _GuitarDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarDuotone: ImageVector? = null
