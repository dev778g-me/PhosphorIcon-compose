package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.HammerDuotone: ImageVector
    get() {
        if (_HammerDuotone != null) {
            return _HammerDuotone!!
        }
        _HammerDuotone = ImageVector.Builder(
            name = "Duotone.HammerDuotone",
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
                moveTo(140f, 148f)
                lineToRelative(28f, -28f)
                lineToRelative(20f, 20f)
                lineToRelative(40.06f, -40.06f)
                lineTo(178.23f, 49.77f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -98.44f, -18f)
                lineTo(136f, 88f)
                lineToRelative(-28f, 28f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(79.7f, 31.83f)
                lineToRelative(0.09f, 0f)
                horizontalLineToRelative(0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 116f)
                lineTo(140f, 148f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(228.06f, 99.94f)
                lineTo(188f, 140f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 64f)
                lineTo(53.77f, 49.77f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124.46f, 0f)
                lineToRelative(67.43f, 67.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.31f)
                lineTo(217f, 157.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineTo(168f, 120f)
                lineTo(66.34f, 221.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineTo(34.34f, 201f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.31f)
                lineTo(136f, 88f)
                lineTo(79.78f, 31.78f)
            }
        }.build()

        return _HammerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HammerDuotone: ImageVector? = null
