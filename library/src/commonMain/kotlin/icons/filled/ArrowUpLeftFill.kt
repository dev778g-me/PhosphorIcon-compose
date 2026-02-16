package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowUpLeftFill: ImageVector
    get() {
        if (_ArrowUpLeftFill != null) {
            return _ArrowUpLeftFill!!
        }
        _ArrowUpLeftFill = ImageVector.Builder(
            name = "Filled.ArrowUpLeftFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(197.66f, 197.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(116f, 127.31f)
                lineTo(69.66f, 173.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 168f)
                verticalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                lineTo(127.31f, 116f)
                lineToRelative(70.35f, 70.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 197.66f, 197.66f)
                close()
            }
        }.build()

        return _ArrowUpLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftFill: ImageVector? = null
