package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EmptyFill: ImageVector
    get() {
        if (_EmptyFill != null) {
            return _EmptyFill!!
        }
        _EmptyFill = ImageVector.Builder(
            name = "Filled.EmptyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(170.49f, 91.59f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.54f, 175f)
                close()
                moveTo(128f, 72f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.49f, 92.41f)
                lineToRelative(73f, -83.37f)
                arcTo(55.67f, 55.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 72f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.13f, 104.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(200f, 128f)
                arcToRelative(71.68f, 71.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.89f, -48.55f)
                lineTo(186f, 73.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, -10.54f)
                lineToRelative(-4.91f, 6.18f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 74.89f, 176.55f)
                lineTo(70f, 182.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.54f)
                lineToRelative(4.91f, -6.18f)
                arcTo(71.95f, 71.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 128f)
                close()
            }
        }.build()

        return _EmptyFill!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyFill: ImageVector? = null
