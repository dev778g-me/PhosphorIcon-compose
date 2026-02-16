package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TreeEvergreenFill: ImageVector
    get() {
        if (_TreeEvergreenFill != null) {
            return _TreeEvergreenFill!!
        }
        _TreeEvergreenFill = ImageVector.Builder(
            name = "Filled.TreeEvergreenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.19f, 195.51f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 200f)
                horizontalLineTo(136f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(200f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.31f, -12.91f)
                lineToRelative(46f, -59.09f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.34f, -12.88f)
                lineToRelative(80f, -104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.68f, 0f)
                lineToRelative(80f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 128f)
                horizontalLineTo(184.36f)
                lineToRelative(45.95f, 59.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.19f, 195.51f)
                close()
            }
        }.build()

        return _TreeEvergreenFill!!
    }

@Suppress("ObjectPropertyName")
private var _TreeEvergreenFill: ImageVector? = null
