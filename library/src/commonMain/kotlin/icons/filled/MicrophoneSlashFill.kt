package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MicrophoneSlashFill: ImageVector
    get() {
        if (_MicrophoneSlashFill != null) {
            return _MicrophoneSlashFill!!
        }
        _MicrophoneSlashFill = ImageVector.Builder(
            name = "Filled.MicrophoneSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.38f, 229.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.3f, -0.54f)
                lineToRelative(-30.92f, -34f)
                arcTo(78.83f, 78.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 207.59f)
                lineTo(136f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 207.6f)
                arcTo(80.11f, 80.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                arcToRelative(63.41f, 63.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.21f, -8.68f)
                lineToRelative(-11.1f, -12.2f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 128f)
                lineTo(80f, 95.09f)
                lineTo(42.08f, 53.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.92f, 42.62f)
                lineToRelative(160f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.38f, 229.92f)
                close()
                moveTo(189.19f, 166.79f)
                arcToRelative(7.88f, 7.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, 0.82f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.19f, -4.49f)
                arcTo(79.16f, 79.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(63.32f, 63.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.48f, 28.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 189.19f, 166.79f)
                close()
                moveTo(161.86f, 137.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 175.74f, 133f)
                arcToRelative(49.49f, 49.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, -5f)
                lineTo(176f, 64f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 44.87f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 8.57f)
                close()
            }
        }.build()

        return _MicrophoneSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlashFill: ImageVector? = null
