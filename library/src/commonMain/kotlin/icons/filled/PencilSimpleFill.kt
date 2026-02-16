package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PencilSimpleFill: ImageVector
    get() {
        if (_PencilSimpleFill != null) {
            return _PencilSimpleFill!!
        }
        _PencilSimpleFill = ImageVector.Builder(
            name = "Filled.PencilSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.31f, 73.37f)
                lineTo(182.63f, 28.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(36.69f, 152f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 163.31f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 219.31f)
                lineTo(227.31f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                close()
                moveTo(192f, 108.68f)
                lineTo(147.31f, 64f)
                lineToRelative(24f, -24f)
                lineTo(216f, 84.68f)
                close()
            }
        }.build()

        return _PencilSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSimpleFill: ImageVector? = null
