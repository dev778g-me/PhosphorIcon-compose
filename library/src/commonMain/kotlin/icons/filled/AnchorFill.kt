package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AnchorFill: ImageVector
    get() {
        if (_AnchorFill != null) {
            return _AnchorFill!!
        }
        _AnchorFill = ImageVector.Builder(
            name = "Filled.AnchorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 144f)
                curveToRelative(0f, 38.11f, -27.67f, 45.66f, -49.9f, 51.72f)
                curveTo(149.77f, 202.36f, 136f, 207.31f, 136f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                curveToRelative(0f, -24.69f, -13.77f, -29.64f, -38.1f, -36.28f)
                curveTo(59.67f, 189.66f, 32f, 182.11f, 32f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                curveToRelative(0f, 24.69f, 13.77f, 29.64f, 38.1f, 36.28f)
                curveToRelative(11.36f, 3.1f, 24.12f, 6.6f, 33.9f, 14.34f)
                verticalLineTo(128f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                verticalLineTo(82.83f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                verticalLineTo(112f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(136f)
                verticalLineToRelative(66.62f)
                curveToRelative(9.78f, -7.74f, 22.54f, -11.24f, 33.9f, -14.34f)
                curveTo(194.23f, 173.64f, 208f, 168.69f, 208f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _AnchorFill!!
    }

@Suppress("ObjectPropertyName")
private var _AnchorFill: ImageVector? = null
