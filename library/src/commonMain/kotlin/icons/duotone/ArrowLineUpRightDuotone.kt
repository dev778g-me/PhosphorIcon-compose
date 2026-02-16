package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowLineUpRightDuotone: ImageVector
    get() {
        if (_ArrowLineUpRightDuotone != null) {
            return _ArrowLineUpRightDuotone!!
        }
        _ArrowLineUpRightDuotone = ImageVector.Builder(
            name = "Duotone.ArrowLineUpRightDuotone",
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
                moveTo(96f, 56f)
                lineToRelative(96f, 0f)
                lineToRelative(0f, 96f)
                lineToRelative(-96f, -96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 216f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 168f)
                lineTo(144f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 56f)
                lineToRelative(96f, 0f)
                lineToRelative(0f, 96f)
                lineToRelative(-96f, -96f)
                close()
            }
        }.build()

        return _ArrowLineUpRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineUpRightDuotone: ImageVector? = null
