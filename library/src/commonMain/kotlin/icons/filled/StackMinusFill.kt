package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StackMinusFill: ImageVector
    get() {
        if (_StackMinusFill != null) {
            return _StackMinusFill!!
        }
        _StackMinusFill = ImageVector.Builder(
            name = "Filled.StackMinusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.91f, 124f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 228f, 134.91f)
                lineToRelative(-96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.06f, 0f)
                lineToRelative(-96f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 121.09f)
                lineToRelative(92f, 53.65f)
                lineToRelative(92f, -53.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230.91f, 124f)
                close()
                moveTo(28f, 86.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(96f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.82f)
                lineToRelative(-96f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.06f, 0f)
                lineToRelative(-96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13.82f)
                close()
                moveTo(232f, 192f)
                lineTo(184f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(140f, 215.76f)
                lineTo(128f, 222.76f)
                lineTo(36f, 169.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 182.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(16f, -9.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 140f, 215.76f)
                close()
            }
        }.build()

        return _StackMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _StackMinusFill: ImageVector? = null
