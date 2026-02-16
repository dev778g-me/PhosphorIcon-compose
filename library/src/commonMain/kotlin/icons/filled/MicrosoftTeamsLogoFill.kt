package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MicrosoftTeamsLogoFill: ImageVector
    get() {
        if (_MicrosoftTeamsLogoFill != null) {
            return _MicrosoftTeamsLogoFill!!
        }
        _MicrosoftTeamsLogoFill = ImageVector.Builder(
            name = "Filled.MicrosoftTeamsLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(219.26f, 80f)
                horizontalLineToRelative(-7.57f)
                arcTo(31.71f, 31.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.88f, -28.85f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.81f, 64f)
                lineTo(40f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(76.67f, 192f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 118.7f, -0.15f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 152f)
                lineTo(232f, 92.74f)
                arcTo(12.76f, 12.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 219.26f, 80f)
                close()
                moveTo(136f, 32f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.07f, 42.68f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 64f)
                lineTo(113.38f, 64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 32f)
                close()
                moveTo(88f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(80f, 112f)
                lineTo(72f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(96f, 112f)
                verticalLineToRelative(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 160f)
                close()
                moveTo(184f, 168f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -89.56f, 24f)
                lineTo(136f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(152f, 96f)
                horizontalLineToRelative(32f)
                close()
                moveTo(184f, 80f)
                lineTo(168f, 80f)
                arcToRelative(39.89f, 39.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, -29.6f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 184f, 80f)
                close()
                moveTo(216f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.36f, 22.75f)
                arcTo(62.76f, 62.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 168f)
                lineTo(200f, 96f)
                horizontalLineToRelative(16f)
                close()
            }
        }.build()

        return _MicrosoftTeamsLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftTeamsLogoFill: ImageVector? = null
