package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SpotifyLogoFill: ImageVector
    get() {
        if (_SpotifyLogoFill != null) {
            return _SpotifyLogoFill!!
        }
        _SpotifyLogoFill = ImageVector.Builder(
            name = "Filled.SpotifyLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(159.07f, 169.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.81f, 3.33f)
                arcToRelative(42.79f, 42.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40.52f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.48f, -14.14f)
                arcToRelative(59.33f, 59.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 55.48f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 159.07f, 169.74f)
                close()
                moveTo(175.07f, 141.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.82f, 3.3f)
                arcToRelative(77.07f, 77.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -72.48f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.52f, -14.12f)
                arcToRelative(93f, 93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.52f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 175.06f, 141.76f)
                close()
                moveTo(191.07f, 113.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.83f, 3.29f)
                arcToRelative(110.62f, 110.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -104.46f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.54f, -14.12f)
                arcToRelative(126.67f, 126.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 119.54f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 191.06f, 113.76f)
                close()
            }
        }.build()

        return _SpotifyLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpotifyLogoFill: ImageVector? = null
