package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AsteriskFill: ImageVector
    get() {
        if (_AsteriskFill != null) {
            return _AsteriskFill!!
        }
        _AsteriskFill = ImageVector.Builder(
            name = "Filled.AsteriskFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(187.43f, 153.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 14.93f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -1.07f)
                lineTo(136f, 141.86f)
                lineTo(136f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 141.86f)
                lineTo(76.57f, 166.93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.65f, 164f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.92f, -10.93f)
                lineTo(112f, 128f)
                lineTo(68.57f, 102.93f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -13.86f)
                lineTo(120f, 114.14f)
                lineTo(120f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(50.14f)
                lineToRelative(43.43f, -25.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.86f)
                lineTo(144f, 128f)
                close()
            }
        }.build()

        return _AsteriskFill!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskFill: ImageVector? = null
