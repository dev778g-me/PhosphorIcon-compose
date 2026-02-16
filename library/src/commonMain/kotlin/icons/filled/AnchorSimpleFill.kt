package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AnchorSimpleFill: ImageVector
    get() {
        if (_AnchorSimpleFill != null) {
            return _AnchorSimpleFill!!
        }
        _AnchorSimpleFill = ImageVector.Builder(
            name = "Filled.AnchorSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 120f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, -208f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(40.36f)
                arcTo(88.15f, 88.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 207.63f)
                verticalLineTo(90.83f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(116.8f)
                arcTo(88.15f, 88.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.64f, 128f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 120f)
                close()
            }
        }.build()

        return _AnchorSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _AnchorSimpleFill: ImageVector? = null
