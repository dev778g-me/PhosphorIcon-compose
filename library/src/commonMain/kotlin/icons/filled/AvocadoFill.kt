package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AvocadoFill: ImageVector
    get() {
        if (_AvocadoFill != null) {
            return _AvocadoFill!!
        }
        _AvocadoFill = ImageVector.Builder(
            name = "Filled.AvocadoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211f, 130.66f)
                lineTo(181.2f, 46.47f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -106f, -1.14f)
                horizontalLineToRelative(0f)
                lineToRelative(-29.51f, 83.5f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 211f, 130.66f)
                close()
                moveTo(128f, 200f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 200f)
                close()
            }
        }.build()

        return _AvocadoFill!!
    }

@Suppress("ObjectPropertyName")
private var _AvocadoFill: ImageVector? = null
