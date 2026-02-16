package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MemoryFill: ImageVector
    get() {
        if (_MemoryFill != null) {
            return _MemoryFill!!
        }
        _MemoryFill = ImageVector.Builder(
            name = "Filled.MemoryFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 56f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 72f)
                lineTo(8f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(24f, 184f)
                lineTo(40f, 184f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(56f, 184f)
                lineTo(72f, 184f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(88f, 184f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(120f, 184f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(152f, 184f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(184f, 184f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(216f, 184f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(248f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 56f)
                close()
                moveTo(208f, 96f)
                verticalLineToRelative(48f)
                lineTo(144f, 144f)
                lineTo(144f, 96f)
                close()
                moveTo(112f, 96f)
                verticalLineToRelative(48f)
                lineTo(48f, 144f)
                lineTo(48f, 96f)
                close()
            }
        }.build()

        return _MemoryFill!!
    }

@Suppress("ObjectPropertyName")
private var _MemoryFill: ImageVector? = null
