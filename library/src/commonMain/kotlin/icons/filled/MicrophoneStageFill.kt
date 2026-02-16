package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MicrophoneStageFill: ImageVector
    get() {
        if (_MicrophoneStageFill != null) {
            return _MicrophoneStageFill!!
        }
        _MicrophoneStageFill = ImageVector.Builder(
            name = "Filled.MicrophoneStageFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(115.06f, 46.36f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.11f, 0.54f)
                arcTo(71.54f, 71.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 88f)
                arcToRelative(73.29f, 73.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 9.42f)
                lineTo(27.12f, 192.22f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.71f, 213f)
                lineTo(43f, 227.29f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.78f, 1.59f)
                lineToRelative(94.81f, -69.53f)
                arcTo(73.29f, 73.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 160f)
                arcToRelative(71.54f, 71.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 41.09f, -12.93f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, -6.11f)
                close()
                moveTo(117.67f, 149.64f)
                lineTo(101.67f, 165.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.31f, -11.31f)
                lineToRelative(16f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 11.31f)
                close()
                moveTo(227.07f, 129.08f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.12f, 0.54f)
                lineTo(126.38f, 35.05f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, -6.12f)
                arcTo(71.93f, 71.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 227.07f, 129.08f)
                close()
            }
        }.build()

        return _MicrophoneStageFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneStageFill: ImageVector? = null
