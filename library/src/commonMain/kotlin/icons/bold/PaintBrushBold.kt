package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PaintBrushBold: ImageVector
    get() {
        if (_PaintBrushBold != null) {
            return _PaintBrushBold!!
        }
        _PaintBrushBold = ImageVector.Builder(
            name = "Bold.PaintBrushBold",
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
                moveTo(16f, 216f)
                horizontalLineTo(92f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, -52f, -52f)
                curveTo(40f, 200f, 16f, 216f, 16f, 216f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.41f, 116.16f)
                curveTo(131.6f, 90.29f, 179.46f, 32f, 224f, 32f)
                curveToRelative(0f, 44.54f, -58.29f, 92.4f, -84.16f, 111.59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(138.4f, 84.54f)
                arcToRelative(92.55f, 92.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33f, 33f)
            }
        }.build()

        return _PaintBrushBold!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushBold: ImageVector? = null
