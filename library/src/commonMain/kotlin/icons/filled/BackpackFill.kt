package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BackpackFill: ImageVector
    get() {
        if (_BackpackFill != null) {
            return _BackpackFill!!
        }
        _BackpackFill = ImageVector.Builder(
            name = "Filled.BackpackFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 40.58f)
                lineTo(168f, 32f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 8f)
                lineTo(112f, 8f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 32f)
                verticalLineToRelative(8.58f)
                arcTo(56.09f, 56.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 96f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 96f)
                arcTo(56.09f, 56.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 40.58f)
                close()
                moveTo(104f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(8f)
                lineTo(104f, 40f)
                close()
                moveTo(112f, 72f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(112f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(176f, 216f)
                lineTo(80f, 216f)
                lineTo(80f, 176f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(24f)
                close()
                moveTo(176f, 160f)
                lineTo(80f, 160f)
                verticalLineToRelative(-8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                close()
            }
        }.build()

        return _BackpackFill!!
    }

@Suppress("ObjectPropertyName")
private var _BackpackFill: ImageVector? = null
