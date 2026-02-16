package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowRightDuotone: ImageVector
    get() {
        if (_ArrowRightDuotone != null) {
            return _ArrowRightDuotone!!
        }
        _ArrowRightDuotone = ImageVector.Builder(
            name = "Duotone.ArrowRightDuotone",
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
                moveTo(144f, 56f)
                lineToRelative(72f, 72f)
                lineToRelative(-72f, 72f)
                lineToRelative(0f, -144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 128f)
                lineTo(144f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 56f)
                lineToRelative(72f, 72f)
                lineToRelative(-72f, 72f)
                lineToRelative(0f, -144f)
                close()
            }
        }.build()

        return _ArrowRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightDuotone: ImageVector? = null
