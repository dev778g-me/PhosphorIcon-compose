package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.ArrowsClockwise: ImageVector
    get() {
        if (_ArrowsClockwise != null) {
            return _ArrowsClockwise!!
        }
        _ArrowsClockwise = ImageVector.Builder(
            name = "Regular.ArrowsClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 96f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 96f)
                lineTo(187.72f, 67.72f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 67f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 160f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 160f)
                lineToRelative(28.28f, 28.28f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 189f)
            }
        }.build()

        return _ArrowsClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsClockwise: ImageVector? = null
