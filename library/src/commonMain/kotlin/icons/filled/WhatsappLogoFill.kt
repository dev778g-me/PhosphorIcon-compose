package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WhatsappLogoFill: ImageVector
    get() {
        if (_WhatsappLogoFill != null) {
            return _WhatsappLogoFill!!
        }
        _WhatsappLogoFill = ImageVector.Builder(
            name = "Filled.WhatsappLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152.58f, 145.23f)
                lineToRelative(23f, 11.48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 176f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, -72f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 99.29f, 80.46f)
                lineToRelative(11.48f, 23f)
                lineTo(101f, 118f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, 7.51f)
                arcToRelative(56.47f, 56.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30.15f, 30.15f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 138f, 155f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.12f, 219.82f)
                lineTo(45.07f, 231.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.24f, -20.24f)
                lineToRelative(11.35f, -34.05f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(192f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.42f, -7.16f)
                lineToRelative(-32f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0.5f)
                lineToRelative(-14.69f, 9.8f)
                arcToRelative(40.55f, 40.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineToRelative(9.8f, -14.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -8f)
                lineToRelative(-16f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 40f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 152f)
                close()
            }
        }.build()

        return _WhatsappLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _WhatsappLogoFill: ImageVector? = null
