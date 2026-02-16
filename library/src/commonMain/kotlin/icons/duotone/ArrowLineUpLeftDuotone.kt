package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowLineUpLeftDuotone: ImageVector
    get() {
        if (_ArrowLineUpLeftDuotone != null) {
            return _ArrowLineUpLeftDuotone!!
        }
        _ArrowLineUpLeftDuotone = ImageVector.Builder(
            name = "Duotone.ArrowLineUpLeftDuotone",
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
                moveTo(168f, 48f)
                lineToRelative(-96f, 0f)
                lineToRelative(0f, 96f)
                lineToRelative(96f, -96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 208f)
                lineTo(224f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 48f)
                lineToRelative(-96f, 0f)
                lineToRelative(0f, 96f)
                lineToRelative(96f, -96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 96f)
                lineTo(184f, 160f)
            }
        }.build()

        return _ArrowLineUpLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineUpLeftDuotone: ImageVector? = null
