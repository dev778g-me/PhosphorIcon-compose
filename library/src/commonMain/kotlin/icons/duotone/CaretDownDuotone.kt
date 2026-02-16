package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CaretDownDuotone: ImageVector
    get() {
        if (_CaretDownDuotone != null) {
            return _CaretDownDuotone!!
        }
        _CaretDownDuotone = ImageVector.Builder(
            name = "Duotone.CaretDownDuotone",
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
                moveTo(208f, 96f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
                lineToRelative(160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 96f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
                lineToRelative(160f, 0f)
                close()
            }
        }.build()

        return _CaretDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDownDuotone: ImageVector? = null
