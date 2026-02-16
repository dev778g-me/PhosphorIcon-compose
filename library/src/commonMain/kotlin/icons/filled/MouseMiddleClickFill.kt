package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MouseMiddleClickFill: ImageVector
    get() {
        if (_MouseMiddleClickFill != null) {
            return _MouseMiddleClickFill!!
        }
        _MouseMiddleClickFill = ImageVector.Builder(
            name = "Filled.MouseMiddleClickFill",
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
                lineTo(152f, 104f)
                lineTo(152f, 88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(136f, 32f)
                horizontalLineToRelative(8f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 80f)
                close()
                moveTo(112f, 32f)
                horizontalLineToRelative(8f)
                lineTo(120f, 72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(16f)
                lineTo(64f, 104f)
                lineTo(64f, 80f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 32f)
                close()
                moveTo(144f, 224f)
                lineTo(112f, 224f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                lineTo(64f, 120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(152f, 120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(56f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 224f)
                close()
            }
        }.build()

        return _MouseMiddleClickFill!!
    }

@Suppress("ObjectPropertyName")
private var _MouseMiddleClickFill: ImageVector? = null
