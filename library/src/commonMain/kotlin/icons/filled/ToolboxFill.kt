package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ToolboxFill: ImageVector
    get() {
        if (_ToolboxFill != null) {
            return _ToolboxFill!!
        }
        _ToolboxFill = ImageVector.Builder(
            name = "Filled.ToolboxFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 64f)
                lineTo(176f, 64f)
                lineTo(176f, 56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                lineTo(104f, 32f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 56f)
                verticalLineToRelative(8f)
                lineTo(32f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 80f)
                verticalLineToRelative(28f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(64f, 112f)
                lineTo(64f, 96.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.47f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 96f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(96f)
                lineTo(176f, 96.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.47f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 96f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(44f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(240f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 64f)
                close()
                moveTo(160f, 64f)
                lineTo(96f, 64f)
                lineTo(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
                moveTo(240f, 132f)
                verticalLineToRelative(60f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 132f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                lineTo(64f, 128f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 143.73f)
                lineTo(80f, 128f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                lineTo(192f, 128f)
                horizontalLineToRelative(44f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 132f)
                close()
            }
        }.build()

        return _ToolboxFill!!
    }

@Suppress("ObjectPropertyName")
private var _ToolboxFill: ImageVector? = null
