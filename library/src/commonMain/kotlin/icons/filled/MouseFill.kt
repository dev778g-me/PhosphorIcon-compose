package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MouseFill: ImageVector
    get() {
        if (_MouseFill != null) {
            return _MouseFill!!
        }
        _MouseFill = ImageVector.Builder(
            name = "Filled.MouseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 16f)
                lineTo(112f, 16f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                horizontalLineToRelative(32f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
                lineTo(208f, 80f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 16f)
                close()
                moveTo(192f, 80f)
                verticalLineToRelative(24f)
                lineTo(136f, 104f)
                lineTo(136f, 32f)
                horizontalLineToRelative(8f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 80f)
                close()
                moveTo(112f, 32f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(72f)
                lineTo(64f, 104f)
                lineTo(64f, 80f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 32f)
                close()
            }
        }.build()

        return _MouseFill!!
    }

@Suppress("ObjectPropertyName")
private var _MouseFill: ImageVector? = null
