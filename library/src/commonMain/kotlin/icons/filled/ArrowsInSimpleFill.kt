package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowsInSimpleFill: ImageVector
    get() {
        if (_ArrowsInSimpleFill != null) {
            return _ArrowsInSimpleFill!!
        }
        _ArrowsInSimpleFill = ImageVector.Builder(
            name = "Filled.ArrowsInSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 53.66f)
                lineTo(179.31f, 88f)
                lineToRelative(18.35f, 18.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 120f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineTo(168f, 76.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
                moveTo(112f, 136f)
                horizontalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineTo(76.69f, 168f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineTo(88f, 179.31f)
                lineToRelative(18.34f, 18.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 192f)
                verticalLineTo(144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 136f)
                close()
            }
        }.build()

        return _ArrowsInSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsInSimpleFill: ImageVector? = null
