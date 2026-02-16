package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BinaryDuotone: ImageVector
    get() {
        if (_BinaryDuotone != null) {
            return _BinaryDuotone!!
        }
        _BinaryDuotone = ImageVector.Builder(
            name = "Duotone.BinaryDuotone",
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
                moveTo(48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                lineTo(224f, 208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 224f)
                lineTo(48f, 224f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 208f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 72f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 0f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -60f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 184f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 0f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -60f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 112f)
                lineToRelative(0f, -80f)
                lineToRelative(-24f, 13.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 224f)
                lineToRelative(0f, -80f)
                lineToRelative(-24f, 13.33f)
            }
        }.build()

        return _BinaryDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BinaryDuotone: ImageVector? = null
