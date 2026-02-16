package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PictureInPictureFill: ImageVector
    get() {
        if (_PictureInPictureFill != null) {
            return _PictureInPictureFill!!
        }
        _PictureInPictureFill = ImageVector.Builder(
            name = "Filled.PictureInPictureFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                lineTo(40f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                lineTo(24f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
                moveTo(216f, 192f)
                lineTo(136f, 192f)
                lineTo(136f, 128f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()

        return _PictureInPictureFill!!
    }

@Suppress("ObjectPropertyName")
private var _PictureInPictureFill: ImageVector? = null
