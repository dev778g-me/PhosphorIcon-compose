package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DropboxLogoFill: ImageVector
    get() {
        if (_DropboxLogoFill != null) {
            return _DropboxLogoFill!!
        }
        _DropboxLogoFill = ImageVector.Builder(
            name = "Filled.DropboxLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(188f, 120f)
                lineTo(128f, 80f)
                lineToRelative(55.56f, -37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.88f, 0f)
                lineTo(238f, 73.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.32f)
                close()
                moveTo(72.44f, 43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.88f, 0f)
                lineTo(18f, 73.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13.32f)
                lineTo(68f, 120f)
                lineToRelative(60f, -40f)
                close()
                moveTo(238f, 153.34f)
                lineTo(188f, 120f)
                lineToRelative(-60f, 40f)
                lineToRelative(55.56f, 37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.88f, 0f)
                lineTo(238f, 166.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 238f, 153.34f)
                close()
                moveTo(18f, 153.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13.32f)
                lineTo(63.56f, 197f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.88f, 0f)
                lineTo(128f, 160f)
                lineTo(68f, 120f)
                close()
                moveTo(168.61f, 206.29f)
                lineTo(130.24f, 180.71f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.44f, 0f)
                lineTo(87.41f, 206.29f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.65f)
                lineTo(123.56f, 237f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.88f, 0f)
                lineToRelative(36.15f, -24.1f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168.59f, 206.29f)
                close()
            }
        }.build()

        return _DropboxLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _DropboxLogoFill: ImageVector? = null
