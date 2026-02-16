package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArmchairFill: ImageVector
    get() {
        if (_ArmchairFill != null) {
            return _ArmchairFill!!
        }
        _ArmchairFill = ImageVector.Builder(
            name = "Filled.ArmchairFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 132f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 27.71f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(159.71f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 132f)
                verticalLineToRelative(36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(144f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(132f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 0f)
                close()
                moveTo(44f, 88f)
                arcToRelative(44.06f, 44.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.81f, 40f)
                horizontalLineToRelative(80.38f)
                arcTo(44.06f, 44.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 88f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
                horizontalLineTo(80f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 72f)
                verticalLineTo(84f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44f, 88f)
                close()
            }
        }.build()

        return _ArmchairFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArmchairFill: ImageVector? = null
