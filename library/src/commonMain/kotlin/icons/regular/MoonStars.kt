package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.MoonStars: ImageVector
    get() {
        if (_MoonStars != null) {
            return _MoonStars!!
        }
        _MoonStars = ImageVector.Builder(
            name = "Regular.MoonStars",
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
                moveTo(208f, 120f)
                lineTo(208f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 96f)
                lineTo(184f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 32f)
                lineTo(160f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 48f)
                lineTo(144f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(210.69f, 158.18f)
                arcTo(96.78f, 96.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 160f)
                arcTo(96.08f, 96.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.82f, 45.31f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 210.69f, 158.18f)
                close()
            }
        }.build()

        return _MoonStars!!
    }

@Suppress("ObjectPropertyName")
private var _MoonStars: ImageVector? = null
