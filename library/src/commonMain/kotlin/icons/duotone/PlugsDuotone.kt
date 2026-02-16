package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PlugsDuotone: ImageVector
    get() {
        if (_PlugsDuotone != null) {
            return _PlugsDuotone!!
        }
        _PlugsDuotone = ImageVector.Builder(
            name = "Duotone.PlugsDuotone",
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
                moveTo(132f, 180f)
                lineToRelative(-29f, 29f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.94f, 0f)
                lineTo(47f, 186.91f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47f, 153f)
                lineToRelative(29f, -29f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(180f, 132f)
                lineToRelative(29f, -29f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -33.94f)
                lineTo(186.91f, 47f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 153f, 47f)
                lineTo(124f, 76f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 144f)
                lineTo(120f, 168f)
            }
            path(fill = SolidColor(Color(0xFF231F20))) {
                moveTo(144f, 144f)
                lineTo(120f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 112f)
                lineTo(88f, 136f)
            }
            path(fill = SolidColor(Color(0xFF231F20))) {
                moveTo(112f, 112f)
                lineTo(88f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 112f)
                lineTo(144f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(58.06f, 197.94f)
                lineTo(24f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132f, 180f)
                lineToRelative(-29f, 29f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.94f, 0f)
                lineTo(47f, 186.91f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47f, 153f)
                lineToRelative(29f, -29f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 64f)
                lineTo(192f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(197.94f, 58.06f)
                lineTo(232f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 132f)
                lineToRelative(29f, -29f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -33.94f)
                lineTo(186.91f, 47f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 153f, 47f)
                lineTo(124f, 76f)
            }
        }.build()

        return _PlugsDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PlugsDuotone: ImageVector? = null
