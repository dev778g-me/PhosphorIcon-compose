package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.RulerBold: ImageVector
    get() {
        if (_RulerBold != null) {
            return _RulerBold!!
        }
        _RulerBold = ImageVector.Builder(
            name = "Bold.RulerBold",
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
                moveTo(26.35f, 165.66f)
                lineTo(165.66f, 26.35f)
                arcTo(8f, 8f, 97.4f, isMoreThanHalf = false, isPositiveArc = true, 176.97f, 26.35f)
                lineTo(229.66f, 79.03f)
                arcTo(8f, 8f, 85.06f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 90.35f)
                lineTo(90.35f, 229.66f)
                arcTo(8f, 8f, 107.99f, isMoreThanHalf = false, isPositiveArc = true, 79.03f, 229.66f)
                lineTo(26.35f, 176.97f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.35f, 165.66f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 64f)
                lineTo(160f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 128f)
                lineTo(96f, 160f)
            }
        }.build()

        return _RulerBold!!
    }

@Suppress("ObjectPropertyName")
private var _RulerBold: ImageVector? = null
