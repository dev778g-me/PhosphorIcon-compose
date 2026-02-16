package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CurrencyNgnDuotone: ImageVector
    get() {
        if (_CurrencyNgnDuotone != null) {
            return _CurrencyNgnDuotone!!
        }
        _CurrencyNgnDuotone = ImageVector.Builder(
            name = "Duotone.CurrencyNgnDuotone",
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
                moveTo(115.51f, 112f)
                lineToRelative(0f, 0f)
                lineToRelative(-51.51f, -66f)
                lineToRelative(0f, 98f)
                lineToRelative(76.49f, 0f)
                lineToRelative(51.51f, 66f)
                lineToRelative(0f, -98f)
                lineToRelative(-76.49f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 144f)
                lineTo(216f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 112f)
                lineTo(216f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 210f)
                lineToRelative(0f, -164f)
                lineToRelative(128f, 164f)
                lineToRelative(0f, -164f)
            }
        }.build()

        return _CurrencyNgnDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyNgnDuotone: ImageVector? = null
