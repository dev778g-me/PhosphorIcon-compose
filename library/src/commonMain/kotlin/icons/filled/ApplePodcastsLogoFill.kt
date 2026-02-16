package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ApplePodcastsLogoFill: ImageVector
    get() {
        if (_ApplePodcastsLogoFill != null) {
            return _ApplePodcastsLogoFill!!
        }
        _ApplePodcastsLogoFill = ImageVector.Builder(
            name = "Filled.ApplePodcastsLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(159.8f, 151.82f)
                arcToRelative(19.67f, 19.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.58f, 17.05f)
                lineToRelative(-12.18f, 48f)
                arcTo(20.17f, 20.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.56f, 232f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(20.17f, 20.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.64f, -15.13f)
                lineToRelative(-12.18f, -48f)
                arcToRelative(19.67f, 19.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.58f, -17.05f)
                arcToRelative(20.17f, 20.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -7.82f)
                horizontalLineToRelative(31.5f)
                arcTo(20.17f, 20.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 159.8f, 151.82f)
                close()
                moveTo(156f, 116f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156f, 116f)
                close()
                moveTo(182f, 143f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.41f, 4.29f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, -138.74f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 74f, 143f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 182f, 143f)
                close()
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 70.18f, 214.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.9f, -13.3f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 97.84f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.9f, 13.3f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
            }
        }.build()

        return _ApplePodcastsLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _ApplePodcastsLogoFill: ImageVector? = null
