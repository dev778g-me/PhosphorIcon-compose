package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.VideoCameraSlashFill: ImageVector
    get() {
        if (_VideoCameraSlashFill != null) {
            return _VideoCameraSlashFill!!
        }
        _VideoCameraSlashFill = ImageVector.Builder(
            name = "Filled.VideoCameraSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 80.23f)
                verticalLineToRelative(95.45f)
                arcToRelative(8.33f, 8.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.86f, 7.17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.58f, -0.19f)
                lineToRelative(-33.78f, -22.52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.78f, -3.33f)
                verticalLineTo(99.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, -3.32f)
                lineToRelative(33.78f, -22.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.73f, 0.66f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 80.23f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineTo(51.73f, 56f)
                horizontalLineTo(32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 72f)
                verticalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(182.64f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
                moveTo(185f, 155.07f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -2.7f)
                verticalLineTo(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(104f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 6.69f)
                close()
            }
        }.build()

        return _VideoCameraSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCameraSlashFill: ImageVector? = null
