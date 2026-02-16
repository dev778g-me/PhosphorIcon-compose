package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandWavingFill: ImageVector
    get() {
        if (_HandWavingFill != null) {
            return _HandWavingFill!!
        }
        _HandWavingFill = ImageVector.Builder(
            name = "Filled.HandWavingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(219.31f, 98.46f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 67.08f, 186.77f)
                horizontalLineToRelative(0f)
                lineTo(26.15f, 115.88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.69f, -16f)
                lineTo(72.4f, 132f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.86f, -8f)
                lineTo(47f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.69f, 40f)
                lineTo(114f, 108f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.85f, -8f)
                lineToRelative(-30f, -52f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.71f, -16f)
                lineTo(166f, 102.12f)
                arcTo(48.25f, 48.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 136f)
                arcToRelative(47.59f, 47.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.6f, 28.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.79f, -9.61f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181f, 110.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.17f, -10.43f)
                lineTo(171.71f, 80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.71f, -16f)
                lineToRelative(19.89f, 34.46f)
                close()
                moveTo(189.94f, 41.46f)
                arcTo(43.74f, 43.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216.74f, 62f)
                lineToRelative(0.33f, 0.57f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.86f, -8f)
                lineTo(230.6f, 54f)
                arcToRelative(59.64f, 59.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36.54f, -28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.12f, 15.46f)
                close()
                moveTo(79.58f, 225.72f)
                arcTo(103.58f, 103.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.93f, 196f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.86f, 8f)
                arcToRelative(119.56f, 119.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.6f, 34.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.91f, -12.56f)
                close()
            }
        }.build()

        return _HandWavingFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandWavingFill: ImageVector? = null
