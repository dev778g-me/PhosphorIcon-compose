package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.StampDuotone: ImageVector
    get() {
        if (_StampDuotone != null) {
            return _StampDuotone!!
        }
        _StampDuotone = ImageVector.Builder(
            name = "Duotone.StampDuotone",
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
                moveTo(114.32f, 136f)
                lineTo(96.54f, 53f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 24f)
                horizontalLineToRelative(16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.47f, 29f)
                lineToRelative(-17.78f, 83f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 224f)
                lineTo(216f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.32f, 136f)
                lineTo(96.54f, 53f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 24f)
                horizontalLineToRelative(16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.47f, 29f)
                lineToRelative(-17.78f, 83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 136f)
                lineTo(208f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 144f)
                lineTo(216f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 192f)
                lineTo(48f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 184f)
                lineTo(40f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 136f)
                close()
            }
        }.build()

        return _StampDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StampDuotone: ImageVector? = null
