package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AppStoreLogoFill: ImageVector
    get() {
        if (_AppStoreLogoFill != null) {
            return _AppStoreLogoFill!!
        }
        _AppStoreLogoFill = ImageVector.Builder(
            name = "Filled.AppStoreLogoFill",
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
                moveTo(83.66f, 180.12f)
                lineToRelative(-4.8f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.72f, -8.24f)
                lineToRelative(4.8f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.72f, 8.24f)
                close()
                moveTo(128f, 152f)
                lineTo(56f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(91.47f, 136f)
                lineToRelative(27.2f, -45.33f)
                lineTo(105.14f, 68.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.72f, -8.24f)
                lineTo(128f, 75.12f)
                lineToRelative(9.14f, -15.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.72f, 8.24f)
                lineTo(110.13f, 136f)
                lineTo(128f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(200f, 152f)
                lineTo(174.13f, 152f)
                lineToRelative(16.73f, 27.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.72f, 8.24f)
                lineToRelative(-38.4f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.72f, -8.24f)
                lineTo(164.53f, 136f)
                lineTo(200f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _AppStoreLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _AppStoreLogoFill: ImageVector? = null
