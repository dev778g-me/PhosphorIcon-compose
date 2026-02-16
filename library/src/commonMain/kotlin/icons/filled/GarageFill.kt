package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GarageFill: ImageVector
    get() {
        if (_GarageFill != null) {
            return _GarageFill!!
        }
        _GarageFill = ImageVector.Builder(
            name = "Filled.GarageFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 192f)
                horizontalLineToRelative(-8f)
                lineTo(232f, 98.67f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.12f, -13.31f)
                lineToRelative(-88f, -58.67f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.75f, 0f)
                lineToRelative(-88f, 58.67f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 98.67f)
                lineTo(24f, 192f)
                lineTo(16f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(136f, 128f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(24f)
                lineTo(136f, 152f)
                close()
                moveTo(120f, 152f)
                lineTo(64f, 152f)
                lineTo(64f, 128f)
                horizontalLineToRelative(56f)
                close()
                moveTo(64f, 168f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(24f)
                lineTo(64f, 192f)
                close()
                moveTo(136f, 168f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(24f)
                lineTo(136f, 192f)
                close()
            }
        }.build()

        return _GarageFill!!
    }

@Suppress("ObjectPropertyName")
private var _GarageFill: ImageVector? = null
