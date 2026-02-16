package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowLineDownLeftDuotone: ImageVector
    get() {
        if (_ArrowLineDownLeftDuotone != null) {
            return _ArrowLineDownLeftDuotone!!
        }
        _ArrowLineDownLeftDuotone = ImageVector.Builder(
            name = "Duotone.ArrowLineDownLeftDuotone",
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
                moveTo(72f, 112f)
                lineToRelative(0f, 96f)
                lineToRelative(96f, 0f)
                lineToRelative(-96f, -96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 48f)
                lineTo(224f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 160f)
                lineTo(184f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 112f)
                lineToRelative(0f, 96f)
                lineToRelative(96f, 0f)
                lineToRelative(-96f, -96f)
                close()
            }
        }.build()

        return _ArrowLineDownLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineDownLeftDuotone: ImageVector? = null
