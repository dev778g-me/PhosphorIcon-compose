package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BoxArrowUpFill: ImageVector
    get() {
        if (_BoxArrowUpFill != null) {
            return _BoxArrowUpFill!!
        }
        _BoxArrowUpFill = ImageVector.Builder(
            name = "Filled.BoxArrowUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.16f, 68.42f)
                lineToRelative(-16f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 32f)
                lineTo(56f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 4.42f)
                lineToRelative(-16f, 32f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 72f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 72f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.16f, 68.42f)
                close()
                moveTo(165.66f, 141.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(136f, 123.31f)
                lineTo(136f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 123.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.66f, 141.66f)
                close()
                moveTo(52.94f, 64f)
                lineToRelative(8f, -16f)
                lineTo(195.06f, 48f)
                lineToRelative(8f, 16f)
                close()
            }
        }.build()

        return _BoxArrowUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _BoxArrowUpFill: ImageVector? = null
