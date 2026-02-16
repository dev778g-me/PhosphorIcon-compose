package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MicrophoneFill: ImageVector
    get() {
        if (_MicrophoneFill != null) {
            return _MicrophoneFill!!
        }
        _MicrophoneFill = ImageVector.Builder(
            name = "Filled.MicrophoneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(80f, 128f)
                lineTo(80f, 64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 0f)
                verticalLineToRelative(64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, 0f)
                close()
                moveTo(208f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -128f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(80.11f, 80.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 79.6f)
                lineTo(120f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 207.6f)
                arcTo(80.11f, 80.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                close()
            }
        }.build()

        return _MicrophoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneFill: ImageVector? = null
