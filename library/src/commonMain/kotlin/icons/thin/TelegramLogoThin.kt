package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.TelegramLogoThin: ImageVector
    get() {
        if (_TelegramLogoThin != null) {
            return _TelegramLogoThin!!
        }
        _TelegramLogoThin = ImageVector.Builder(
            name = "Thin.TelegramLogoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 134.87f)
                lineTo(170.26f, 214f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.09f, -4.21f)
                lineTo(224f, 33.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.34f, -1.15f)
                lineTo(20f, 111.38f)
                arcTo(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 123.3f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 134.87f)
                lineTo(223.41f, 32.09f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(124.37f, 173.78f)
                lineTo(93.76f, 205.54f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 200f)
                verticalLineTo(134.87f)
            }
        }.build()

        return _TelegramLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _TelegramLogoThin: ImageVector? = null
