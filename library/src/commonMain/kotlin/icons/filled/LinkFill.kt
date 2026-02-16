package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LinkFill: ImageVector
    get() {
        if (_LinkFill != null) {
            return _LinkFill!!
        }
        _LinkFill = ImageVector.Builder(
            name = "Filled.LinkFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(115.7f, 192.49f)
                arcToRelative(43.31f, 43.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -55f, -66.43f)
                lineToRelative(25.37f, -25.37f)
                arcToRelative(43.35f, 43.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.25f, 0f)
                arcToRelative(42.9f, 42.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.95f, 15.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15f, 5.6f)
                arcTo(27.33f, 27.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 97.37f, 112f)
                lineTo(72f, 137.37f)
                arcToRelative(27.32f, 27.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.68f, 41.91f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 13.21f)
                close()
                moveTo(195.31f, 129.94f)
                lineTo(169.94f, 155.31f)
                arcTo(43f, 43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 139.32f, 168f)
                horizontalLineToRelative(0f)
                arcToRelative(43.35f, 43.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40.53f, -28.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, -5.6f)
                arcTo(27.35f, 27.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 139.28f, 152f)
                horizontalLineToRelative(0f)
                arcToRelative(27.14f, 27.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.32f, -8f)
                lineTo(184f, 118.63f)
                arcToRelative(27.32f, 27.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34.68f, -41.91f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, -13.21f)
                arcToRelative(43.32f, 43.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 55f, 66.43f)
                close()
            }
        }.build()

        return _LinkFill!!
    }

@Suppress("ObjectPropertyName")
private var _LinkFill: ImageVector? = null
