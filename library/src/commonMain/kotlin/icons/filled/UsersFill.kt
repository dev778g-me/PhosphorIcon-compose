package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UsersFill: ImageVector
    get() {
        if (_UsersFill != null) {
            return _UsersFill!!
        }
        _UsersFill = ImageVector.Builder(
            name = "Filled.UsersFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(164.47f, 195.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.7f, 12.37f)
                lineTo(10.23f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.7f, -12.37f)
                arcToRelative(95.83f, 95.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.22f, -37.71f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 66.5f, 0f)
                arcTo(95.83f, 95.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164.47f, 195.63f)
                close()
                moveTo(252.38f, 195.48f)
                arcToRelative(95.87f, 95.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -47.13f, -37.56f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144.7f, 54.59f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, 6f)
                arcTo(75.83f, 75.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 147f, 150.53f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.07f, 5.53f)
                arcToRelative(112.32f, 112.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.85f, 30.83f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.65f, 16.47f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.95f, 4.64f)
                horizontalLineToRelative(60.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.73f, -5.93f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 252.38f, 195.48f)
                close()
            }
        }.build()

        return _UsersFill!!
    }

@Suppress("ObjectPropertyName")
private var _UsersFill: ImageVector? = null
