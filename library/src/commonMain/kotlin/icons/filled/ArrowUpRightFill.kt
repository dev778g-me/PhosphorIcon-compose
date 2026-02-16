package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowUpRightFill: ImageVector
    get() {
        if (_ArrowUpRightFill != null) {
            return _ArrowUpRightFill!!
        }
        _ArrowUpRightFill = ImageVector.Builder(
            name = "Filled.ArrowUpRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 64f)
                verticalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(140f, 127.31f)
                lineTo(69.66f, 197.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(128.69f, 116f)
                lineTo(82.34f, 69.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 56f)
                horizontalLineTo(192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 64f)
                close()
            }
        }.build()

        return _ArrowUpRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightFill: ImageVector? = null
