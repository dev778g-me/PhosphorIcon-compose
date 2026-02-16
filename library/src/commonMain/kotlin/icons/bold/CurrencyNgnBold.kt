package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.CurrencyNgnBold: ImageVector
    get() {
        if (_CurrencyNgnBold != null) {
            return _CurrencyNgnBold!!
        }
        _CurrencyNgnBold = ImageVector.Builder(
            name = "Bold.CurrencyNgnBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 128f)
                lineTo(216f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 210f)
                lineToRelative(0f, -164f)
                lineToRelative(128f, 164f)
                lineToRelative(0f, -164f)
            }
        }.build()

        return _CurrencyNgnBold!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyNgnBold: ImageVector? = null
