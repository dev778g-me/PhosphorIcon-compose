package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShoppingCartSimpleFill: ImageVector
    get() {
        if (_ShoppingCartSimpleFill != null) {
            return _ShoppingCartSimpleFill!!
        }
        _ShoppingCartSimpleFill = ImageVector.Builder(
            name = "Filled.ShoppingCartSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.71f, 74.14f)
                lineToRelative(-25.64f, 92.28f)
                arcTo(24.06f, 24.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 191f, 184f)
                lineTo(92.16f, 184f)
                arcTo(24.06f, 24.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69f, 166.42f)
                lineTo(33.92f, 40f)
                lineTo(16f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(40f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 5.86f)
                lineTo(57.19f, 64f)
                lineTo(232f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 10.14f)
                close()
                moveTo(88f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 200f)
                close()
                moveTo(192f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 200f)
                close()
            }
        }.build()

        return _ShoppingCartSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCartSimpleFill: ImageVector? = null
