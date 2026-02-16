package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DnaFill: ImageVector
    get() {
        if (_DnaFill != null) {
            return _DnaFill!!
        }
        _DnaFill = ImageVector.Builder(
            name = "Filled.DnaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 204.5f)
                verticalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(204.5f)
                arcToRelative(63.67f, 63.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.38f, -57.25f)
                lineToRelative(-48.4f, -24.19f)
                arcTo(79.58f, 79.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 51.5f)
                verticalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineTo(51.5f)
                arcToRelative(63.67f, 63.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.38f, 57.25f)
                lineToRelative(48.4f, 24.19f)
                arcTo(79.58f, 79.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 204.5f)
                close()
                moveTo(163.18f, 192f)
                horizontalLineTo(83.91f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8.53f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.18f, 176f)
                horizontalLineTo(149.7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, -6.9f)
                arcToRelative(48.24f, 48.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, -7.53f)
                lineTo(94.8f, 138.23f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.08f, 0.3f)
                arcTo(79.51f, 79.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 204.5f)
                verticalLineToRelative(27.23f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.47f, 240f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 232f)
                verticalLineTo(216f)
                horizontalLineToRelative(92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineToRelative(-7.5f)
                arcToRelative(48.76f, 48.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -9.32f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 163.18f, 192f)
                close()
                moveTo(191.47f, 16f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 24.27f)
                verticalLineTo(40f)
                horizontalLineTo(92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(7.5f)
                arcToRelative(48.76f, 48.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 9.32f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.82f, 64f)
                horizontalLineToRelative(79f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                horizontalLineTo(106.3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 6.9f)
                arcToRelative(48.24f, 48.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7.53f)
                lineToRelative(46.67f, 23.34f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.08f, -0.3f)
                arcTo(79.51f, 79.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 51.5f)
                verticalLineTo(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 191.47f, 16f)
                close()
            }
        }.build()

        return _DnaFill!!
    }

@Suppress("ObjectPropertyName")
private var _DnaFill: ImageVector? = null
