package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EjectSimpleFill: ImageVector
    get() {
        if (_EjectSimpleFill != null) {
            return _EjectSimpleFill!!
        }
        _EjectSimpleFill = ImageVector.Builder(
            name = "Filled.EjectSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(224f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 200f)
                close()
                moveTo(40.09f, 160f)
                horizontalLineTo(215.91f)
                arcToRelative(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.48f, -26.23f)
                lineTo(146.74f, 32.94f)
                arcToRelative(24.11f, 24.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -37.48f, 0f)
                lineTo(27.61f, 133.77f)
                arcTo(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.09f, 160f)
                close()
            }
        }.build()

        return _EjectSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _EjectSimpleFill: ImageVector? = null
