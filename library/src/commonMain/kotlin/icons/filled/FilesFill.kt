package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FilesFill: ImageVector
    get() {
        if (_FilesFill != null) {
            return _FilesFill!!
        }
        _FilesFill = ImageVector.Builder(
            name = "Filled.FilesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 66.34f)
                lineToRelative(-40f, -40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 24f)
                lineTo(88f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 40f)
                lineTo(72f, 56f)
                lineTo(56f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 72f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(168f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(184f, 200f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 66.34f)
                close()
                moveTo(136f, 192f)
                lineTo(88f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(136f, 160f)
                lineTo(88f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(200f, 184f)
                lineTo(184f, 184f)
                lineTo(184f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineToRelative(-40f, -40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 56f)
                lineTo(88f, 56f)
                lineTo(88f, 40f)
                horizontalLineToRelative(76.69f)
                lineTo(200f, 75.31f)
                close()
            }
        }.build()

        return _FilesFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilesFill: ImageVector? = null
