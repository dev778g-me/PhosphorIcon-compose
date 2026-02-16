package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GitBranchFill: ImageVector
    get() {
        if (_GitBranchFill != null) {
            return _GitBranchFill!!
        }
        _GitBranchFill = ImageVector.Builder(
            name = "Filled.GitBranchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -40f, 31f)
                verticalLineToRelative(17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(96f)
                arcToRelative(23.84f, 23.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 1.38f)
                verticalLineTo(95f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(66f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 0f)
                verticalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(88f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(95f)
                arcTo(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 64f)
                close()
                moveTo(64f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                close()
                moveTo(96f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 192f)
                close()
            }
        }.build()

        return _GitBranchFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitBranchFill: ImageVector? = null
