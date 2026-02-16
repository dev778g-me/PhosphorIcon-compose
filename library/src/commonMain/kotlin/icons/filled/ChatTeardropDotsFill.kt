package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChatTeardropDotsFill: ImageVector
    get() {
        if (_ChatTeardropDotsFill != null) {
            return _ChatTeardropDotsFill!!
        }
        _ChatTeardropDotsFill = ImageVector.Builder(
            name = "Filled.ChatTeardropDotsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(132f, 24f)
                arcTo(100.11f, 100.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 124f)
                verticalLineToRelative(84f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(84f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -200f)
                close()
                moveTo(88f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 140f)
                close()
                moveTo(132f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 140f)
                close()
                moveTo(176f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 140f)
                close()
            }
        }.build()

        return _ChatTeardropDotsFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropDotsFill: ImageVector? = null
