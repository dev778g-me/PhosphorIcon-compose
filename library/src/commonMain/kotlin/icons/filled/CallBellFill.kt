package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CallBellFill: ImageVector
    get() {
        if (_CallBellFill != null) {
            return _CallBellFill!!
        }
        _CallBellFill = ImageVector.Builder(
            name = "Filled.CallBellFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(8f)
                lineTo(32f, 152f)
                arcToRelative(96.12f, 96.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, -95.66f)
                lineTo(120f, 40f)
                lineTo(104f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(136f, 40f)
                lineTo(136f, 56.34f)
                arcTo(96.12f, 96.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 152f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(24f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 176f)
                close()
                moveTo(232f, 200f)
                lineTo(24f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(232f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _CallBellFill!!
    }

@Suppress("ObjectPropertyName")
private var _CallBellFill: ImageVector? = null
