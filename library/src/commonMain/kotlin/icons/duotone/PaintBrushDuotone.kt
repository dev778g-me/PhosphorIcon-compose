package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PaintBrushDuotone: ImageVector
    get() {
        if (_PaintBrushDuotone != null) {
            return _PaintBrushDuotone!!
        }
        _PaintBrushDuotone = ImageVector.Builder(
            name = "Duotone.PaintBrushDuotone",
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
                moveTo(165.36f, 123.05f)
                curveTo(192.36f, 99.43f, 224f, 64.81f, 224f, 32f)
                curveTo(191.19f, 32f, 156.57f, 63.64f, 133f, 90.64f)
                arcTo(84.39f, 84.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.36f, 123.05f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 216f)
                horizontalLineTo(92f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, -52f, -52f)
                curveTo(40f, 200f, 16f, 216f, 16f, 216f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.41f, 116.16f)
                curveTo(131.6f, 90.29f, 179.46f, 32f, 224f, 32f)
                curveToRelative(0f, 44.54f, -58.29f, 92.4f, -84.16f, 111.59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(133f, 90.64f)
                arcToRelative(84.39f, 84.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.41f, 32.41f)
            }
        }.build()

        return _PaintBrushDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushDuotone: ImageVector? = null
