package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PlugsFill: ImageVector
    get() {
        if (_PlugsFill != null) {
            return _PlugsFill!!
        }
        _PlugsFill = ImageVector.Builder(
            name = "Filled.PlugsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(149.66f, 149.66f)
                lineTo(131.31f, 168f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(132f, 191.31f)
                lineToRelative(-23.31f, 23.32f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.26f, 0f)
                lineToRelative(-5.37f, -5.38f)
                lineToRelative(-28.4f, 28.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(28.41f, -28.4f)
                lineToRelative(-5.38f, -5.37f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -45.26f)
                lineTo(64.69f, 124f)
                lineToRelative(-6.35f, -6.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(88f, 124.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(99.31f, 136f)
                lineTo(120f, 156.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
                moveTo(237.66f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-28.4f, 28.41f)
                lineToRelative(-5.37f, -5.38f)
                arcToRelative(32.05f, 32.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, 0f)
                lineTo(124f, 64.69f)
                lineToRelative(-6.34f, -6.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineToRelative(80f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                lineTo(191.31f, 132f)
                lineToRelative(23.32f, -23.31f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -45.26f)
                lineToRelative(-5.38f, -5.37f)
                lineToRelative(28.41f, -28.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.66f, 18.34f)
                close()
            }
        }.build()

        return _PlugsFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlugsFill: ImageVector? = null
