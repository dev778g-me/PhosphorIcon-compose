package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LeafFill: ImageVector
    get() {
        if (_LeafFill != null) {
            return _LeafFill!!
        }
        _LeafFill = ImageVector.Builder(
            name = "Filled.LeafFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.45f, 40.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.52f, -7.52f)
                curveTo(139.8f, 28.08f, 78.82f, 51f, 52.82f, 94f)
                arcToRelative(87.09f, 87.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.76f, 49f)
                arcTo(101.72f, 101.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46.7f, 175.2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.61f, 1.43f)
                lineToRelative(85f, -86.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(56.74f, 195.94f)
                lineTo(42.55f, 210.13f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 11.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, 0.43f)
                lineToRelative(16.79f, -16.79f)
                curveToRelative(14.14f, 6.84f, 28.41f, 10.57f, 42.56f, 11.07f)
                quadToRelative(1.67f, 0.06f, 3.33f, 0.06f)
                arcTo(86.93f, 86.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 162f, 203.18f)
                curveTo(205f, 177.18f, 227.93f, 116.21f, 223.45f, 40.07f)
                close()
            }
        }.build()

        return _LeafFill!!
    }

@Suppress("ObjectPropertyName")
private var _LeafFill: ImageVector? = null
