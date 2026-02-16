package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.CurrencyEthLight: ImageVector
    get() {
        if (_CurrencyEthLight != null) {
            return _CurrencyEthLight!!
        }
        _CurrencyEthLight = ImageVector.Builder(
            name = "Light.CurrencyEthLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 16f)
                lineTo(128f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 128f)
                lineToRelative(-88f, 40f)
                lineToRelative(-88f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 16f)
                lineToRelative(88f, 112f)
                lineToRelative(-88f, 112f)
                lineToRelative(-88f, -112f)
                lineToRelative(88f, -112f)
                close()
            }
        }.build()

        return _CurrencyEthLight!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEthLight: ImageVector? = null
