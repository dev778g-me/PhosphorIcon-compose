package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BroadcastFill: ImageVector
    get() {
        if (_BroadcastFill != null) {
            return _BroadcastFill!!
        }
        _BroadcastFill = ImageVector.Builder(
            name = "Filled.BroadcastFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 128f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 128f)
                close()
                moveTo(208f, 128f)
                arcToRelative(79.74f, 79.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.37f, -53.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.92f, 10.67f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 85.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.92f, 10.67f)
                arcTo(79.79f, 79.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                close()
                moveTo(80.29f, 85.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 68.37f, 74.67f)
                arcToRelative(79.94f, 79.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 106.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.92f, -10.67f)
                arcToRelative(63.95f, 63.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -85.33f)
                close()
                moveTo(238.57f, 81.34f)
                arcTo(119.48f, 119.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.71f, 44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.42f, 11.2f)
                arcToRelative(103.9f, 103.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 145.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 213.71f, 212f)
                arcTo(120.12f, 120.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 238.57f, 81.29f)
                close()
                moveTo(32.17f, 168.48f)
                arcTo(103.9f, 103.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.71f, 55.22f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.29f, 44f)
                arcToRelative(119.87f, 119.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.42f, -11.2f)
                arcTo(103.61f, 103.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.17f, 168.48f)
                close()
            }
        }.build()

        return _BroadcastFill!!
    }

@Suppress("ObjectPropertyName")
private var _BroadcastFill: ImageVector? = null
