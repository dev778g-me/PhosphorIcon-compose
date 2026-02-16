package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CaretDoubleUpDuotone: ImageVector
    get() {
        if (_CaretDoubleUpDuotone != null) {
            return _CaretDoubleUpDuotone!!
        }
        _CaretDoubleUpDuotone = ImageVector.Builder(
            name = "Duotone.CaretDoubleUpDuotone",
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
                moveTo(48f, 200f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 200f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 120f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
            }
        }.build()

        return _CaretDoubleUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleUpDuotone: ImageVector? = null
