package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MagnifyingGlassFill: ImageVector
    get() {
        if (_MagnifyingGlassFill != null) {
            return _MagnifyingGlassFill!!
        }
        _MagnifyingGlassFill = ImageVector.Builder(
            name = "Filled.MagnifyingGlassFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 112f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56f, -56f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 112f)
                close()
                moveTo(229.66f, 229.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-50.06f, -50.07f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, -11.31f)
                lineToRelative(50.06f, 50.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 229.66f)
                close()
                moveTo(112f, 184f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, -72f, -72f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 184f)
                close()
            }
        }.build()

        return _MagnifyingGlassFill!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassFill: ImageVector? = null
