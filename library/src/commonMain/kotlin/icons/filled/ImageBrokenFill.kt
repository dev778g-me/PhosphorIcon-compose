package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ImageBrokenFill: ImageVector
    get() {
        if (_ImageBrokenFill != null) {
            return _ImageBrokenFill!!
        }
        _ImageBrokenFill = ImageVector.Builder(
            name = "Filled.ImageBrokenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.59f, -5.47f)
                lineToRelative(14.83f, -44.48f)
                lineTo(163f, 151.43f)
                arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.46f, -4.46f)
                lineToRelative(14.62f, -36.55f)
                lineToRelative(44.48f, -14.83f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 88f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(117f, 152.57f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.62f, 4.9f)
                lineTo(98.23f, 200f)
                lineTo(40f, 200f)
                lineTo(40f, 160.69f)
                lineToRelative(46.34f, -46.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32.84f, 32.84f)
                close()
                moveTo(232f, 121.73f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(137.73f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.59f, -10.53f)
                lineToRelative(7.94f, -23.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.61f, -4.9f)
                lineToRelative(35.77f, -14.31f)
                lineToRelative(14.31f, -35.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, -4.61f)
                lineToRelative(23.8f, -7.94f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 121.73f)
                close()
            }
        }.build()

        return _ImageBrokenFill!!
    }

@Suppress("ObjectPropertyName")
private var _ImageBrokenFill: ImageVector? = null
