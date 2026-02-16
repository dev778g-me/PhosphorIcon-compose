package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MagnifyingGlassMinusFill: ImageVector
    get() {
        if (_MagnifyingGlassMinusFill != null) {
            return _MagnifyingGlassMinusFill!!
        }
        _MagnifyingGlassMinusFill = ImageVector.Builder(
            name = "Filled.MagnifyingGlassMinusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.66f, 218.34f)
                lineTo(179.6f, 168.28f)
                arcToRelative(88.21f, 88.21f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.32f, 11.31f)
                lineToRelative(50.06f, 50.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(144f, 120f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _MagnifyingGlassMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassMinusFill: ImageVector? = null
