package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.VideoCameraFill: ImageVector
    get() {
        if (_VideoCameraFill != null) {
            return _VideoCameraFill!!
        }
        _VideoCameraFill = ImageVector.Builder(
            name = "Filled.VideoCameraFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 72f)
                lineTo(192f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(32f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 56f)
                lineTo(176f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 72f)
                close()
                moveTo(250f, 72.25f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.63f, 1.22f)
                lineTo(209.78f, 95.86f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 99.19f)
                verticalLineToRelative(57.62f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.78f, 3.33f)
                lineToRelative(33.78f, 22.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.58f, 0.19f)
                arcToRelative(8.33f, 8.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.86f, -7.17f)
                lineTo(256f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 250f, 72.25f)
                close()
            }
        }.build()

        return _VideoCameraFill!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCameraFill: ImageVector? = null
