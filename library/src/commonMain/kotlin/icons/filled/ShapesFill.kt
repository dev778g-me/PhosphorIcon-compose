package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShapesFill: ImageVector
    get() {
        if (_ShapesFill != null) {
            return _ShapesFill!!
        }
        _ShapesFill = ImageVector.Builder(
            name = "Filled.ShapesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(111.59f, 181.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 192f)
                lineTo(24f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.59f, -10.53f)
                lineToRelative(40f, -120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.18f, 0f)
                close()
                moveTo(208f, 76f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, -52f, 52f)
                arcTo(52.06f, 52.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 76f)
                close()
                moveTo(224f, 144f)
                lineTo(136f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(232f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 144f)
                close()
            }
        }.build()

        return _ShapesFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShapesFill: ImageVector? = null
