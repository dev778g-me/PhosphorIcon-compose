package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SockFill: ImageVector
    get() {
        if (_SockFill != null) {
            return _SockFill!!
        }
        _SockFill = ImageVector.Builder(
            name = "Filled.SockFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 16f)
                lineTo(104f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 32f)
                verticalLineToRelative(76.69f)
                lineTo(49.25f, 147.43f)
                arcToRelative(58.92f, 58.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.32f, 83.32f)
                lineTo(201f, 162.34f)
                arcToRelative(23.85f, 23.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -17f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 16f)
                close()
                moveTo(192f, 32f)
                horizontalLineToRelative(0f)
                lineTo(192f, 56f)
                lineTo(104f, 56f)
                lineTo(104f, 32f)
                close()
                moveTo(189.66f, 151f)
                lineTo(157.8f, 182.88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.2f, -70.2f)
                verticalLineToRelative(32.69f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 189.66f, 151f)
                close()
            }
        }.build()

        return _SockFill!!
    }

@Suppress("ObjectPropertyName")
private var _SockFill: ImageVector? = null
