package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CaretLeftDuotone: ImageVector
    get() {
        if (_CaretLeftDuotone != null) {
            return _CaretLeftDuotone!!
        }
        _CaretLeftDuotone = ImageVector.Builder(
            name = "Duotone.CaretLeftDuotone",
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
                moveTo(160f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(0f, 160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(0f, 160f)
                close()
            }
        }.build()

        return _CaretLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeftDuotone: ImageVector? = null
