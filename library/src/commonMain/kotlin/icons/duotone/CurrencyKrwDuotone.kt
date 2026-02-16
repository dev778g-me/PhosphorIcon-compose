package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CurrencyKrwDuotone: ImageVector
    get() {
        if (_CurrencyKrwDuotone != null) {
            return _CurrencyKrwDuotone!!
        }
        _CurrencyKrwDuotone = ImageVector.Builder(
            name = "Duotone.CurrencyKrwDuotone",
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
                moveTo(50f, 136f)
                lineToRelative(26f, 64f)
                lineToRelative(26f, -64f)
                lineToRelative(26f, -64f)
                lineToRelative(26f, 64f)
                lineToRelative(26f, 64f)
                lineToRelative(26f, -64f)
                lineToRelative(-156f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 72f)
                lineToRelative(52f, 128f)
                lineToRelative(52f, -128f)
                lineToRelative(52f, 128f)
                lineToRelative(52f, -128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 136f)
                lineTo(240f, 136f)
            }
        }.build()

        return _CurrencyKrwDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrwDuotone: ImageVector? = null
