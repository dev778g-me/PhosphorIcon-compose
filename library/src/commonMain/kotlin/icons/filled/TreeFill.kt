package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TreeFill: ImageVector
    get() {
        if (_TreeFill != null) {
            return _TreeFill!!
        }
        _TreeFill = ImageVector.Builder(
            name = "Filled.TreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 187.85f)
                arcToRelative(72.44f, 72.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4.62f)
                verticalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(192.47f)
                arcTo(72.44f, 72.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 187.85f)
                close()
                moveTo(198.1f, 62.59f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -140.2f, 0f)
                arcTo(71.71f, 71.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 127.8f)
                curveTo(15.9f, 166f, 48f, 199f, 86.14f, 200f)
                arcTo(72.22f, 72.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 192.47f)
                verticalLineTo(156.94f)
                lineTo(76.42f, 135.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.16f, -14.32f)
                lineTo(120f, 139.06f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(27.06f)
                lineToRelative(36.42f, -18.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.16f, 14.32f)
                lineTo(136f, 132.94f)
                verticalLineToRelative(59.53f)
                arcTo(72.17f, 72.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 200f)
                lineToRelative(1.82f, 0f)
                curveTo(208f, 199f, 240.11f, 166f, 240f, 127.8f)
                arcTo(71.71f, 71.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 198.1f, 62.59f)
                close()
            }
        }.build()

        return _TreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _TreeFill: ImageVector? = null
