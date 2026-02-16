package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PencilSimpleLineFill: ImageVector
    get() {
        if (_PencilSimpleLineFill != null) {
            return _PencilSimpleLineFill!!
        }
        _PencilSimpleLineFill = ImageVector.Builder(
            name = "Filled.PencilSimpleLineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(36.69f, 152f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 163.31f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(115.32f)
                lineToRelative(112f, -112f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.32f, 73.37f)
                close()
                moveTo(192f, 108.69f)
                lineTo(147.32f, 64f)
                lineToRelative(24f, -24f)
                lineTo(216f, 84.69f)
                close()
            }
        }.build()

        return _PencilSimpleLineFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSimpleLineFill: ImageVector? = null
