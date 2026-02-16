package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DiscordLogoFill: ImageVector
    get() {
        if (_DiscordLogoFill != null) {
            return _DiscordLogoFill!!
        }
        _DiscordLogoFill = ImageVector.Builder(
            name = "Filled.DiscordLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.51f, 174.39f)
                lineTo(218f, 58f)
                arcToRelative(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13f, -11.88f)
                lineToRelative(-36.06f, -5.92f)
                arcToRelative(16.22f, 16.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.26f, 11.88f)
                lineToRelative(-0.21f, 0.85f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.27f, 4.93f)
                arcToRelative(155.62f, 155.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.41f, 5.62f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.62f, 9.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.19f, 5.64f)
                arcToRelative(155.4f, 155.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -90.8f, -0.1f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.28f, -4.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.08f, -10.33f)
                arcToRelative(156.85f, 156.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.72f, -5.72f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.27f, -4.93f)
                lineToRelative(-0.21f, -0.85f)
                arcTo(16.21f, 16.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.08f, 40.21f)
                lineTo(51f, 46.13f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 38f, 58f)
                lineTo(8.49f, 174.39f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.06f, 18.51f)
                lineToRelative(67f, 29.71f)
                arcToRelative(16.17f, 16.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.71f, -9.1f)
                lineToRelative(3.49f, -9.45f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.27f, -5.35f)
                arcToRelative(158.13f, 158.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.63f, -6.2f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.61f, -9.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.2f, -5.66f)
                arcToRelative(155.59f, 155.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.12f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.19f, 5.65f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.61f, 9.68f)
                arcToRelative(157.84f, 157.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.62f, 6.2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.27f, 5.35f)
                lineToRelative(3.49f, 9.45f)
                arcToRelative(16.18f, 16.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.71f, 9.1f)
                lineToRelative(67f, -29.71f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.51f, 174.39f)
                close()
                moveTo(92f, 152f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 152f)
                close()
                moveTo(164f, 152f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 152f)
                close()
            }
        }.build()

        return _DiscordLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiscordLogoFill: ImageVector? = null
