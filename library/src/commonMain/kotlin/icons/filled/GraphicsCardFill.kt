package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GraphicsCardFill: ImageVector
    get() {
        if (_GraphicsCardFill != null) {
            return _GraphicsCardFill!!
        }
        _GraphicsCardFill = ImageVector.Builder(
            name = "Filled.GraphicsCardFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 48f)
                lineTo(16f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(8f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(24f, 192f)
                lineTo(40f, 192f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(56f, 192f)
                lineTo(72f, 192f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(88f, 192f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(120f, 192f)
                lineTo(232f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(248f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 48f)
                close()
                moveTo(212f, 120f)
                arcToRelative(35.81f, 35.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.53f, 19.16f)
                lineTo(156.84f, 89.53f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 120f)
                close()
                moveTo(116f, 120f)
                arcToRelative(35.81f, 35.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.53f, 19.16f)
                lineTo(60.84f, 89.53f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 120f)
                close()
                moveTo(80f, 156f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30.47f, -55.16f)
                lineToRelative(49.63f, 49.63f)
                arcTo(35.81f, 35.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 156f)
                close()
                moveTo(140f, 120f)
                arcToRelative(35.81f, 35.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.53f, -19.16f)
                lineToRelative(49.63f, 49.63f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 120f)
                close()
            }
        }.build()

        return _GraphicsCardFill!!
    }

@Suppress("ObjectPropertyName")
private var _GraphicsCardFill: ImageVector? = null
