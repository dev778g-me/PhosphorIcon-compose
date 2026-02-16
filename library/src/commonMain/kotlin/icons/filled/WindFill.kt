package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WindFill: ImageVector
    get() {
        if (_WindFill != null) {
            return _WindFill!!
        }
        _WindFill = ImageVector.Builder(
            name = "Filled.WindFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 104f)
                lineTo(24f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.27f, 88f)
                lineTo(112f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 111.73f, 72f)
                lineTo(92.29f, 72f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4.58f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 104f)
                close()
                moveTo(239.92f, 101.71f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -63.59f, -2.29f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.58f)
                horizontalLineToRelative(19.44f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                lineTo(32.27f, 120f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 127.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 136f)
                lineTo(208f, 136f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.92f, 101.71f)
                close()
                moveTo(152f, 152f)
                lineTo(40.27f, 152f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 159.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 168f)
                lineTo(143.73f, 168f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                lineTo(124.29f, 184f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4.58f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 152f, 152f)
                close()
            }
        }.build()

        return _WindFill!!
    }

@Suppress("ObjectPropertyName")
private var _WindFill: ImageVector? = null
