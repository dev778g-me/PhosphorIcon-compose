package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GooglePhotosLogoFill: ImageVector
    get() {
        if (_GooglePhotosLogoFill != null) {
            return _GooglePhotosLogoFill!!
        }
        _GooglePhotosLogoFill = ImageVector.Builder(
            name = "Filled.GooglePhotosLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 120f)
                lineTo(192.49f, 120f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(120f, 63.51f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(63.51f, 136f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(136f, 192.49f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 120f)
                close()
                moveTo(88f, 72f)
                arcToRelative(55.31f, 55.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 10f)
                verticalLineToRelative(38f)
                lineTo(32.57f, 120f)
                arcTo(56.09f, 56.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 72f)
                close()
                moveTo(168f, 184f)
                arcTo(55.31f, 55.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 174f)
                lineTo(136f, 136f)
                horizontalLineToRelative(87.43f)
                arcTo(56.09f, 56.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 184f)
                close()
            }
        }.build()

        return _GooglePhotosLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePhotosLogoFill: ImageVector? = null
