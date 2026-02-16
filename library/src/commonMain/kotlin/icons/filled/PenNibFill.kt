package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PenNibFill: ImageVector
    get() {
        if (_PenNibFill != null) {
            return _PenNibFill!!
        }
        _PenNibFill = ImageVector.Builder(
            name = "Filled.PenNibFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(243.31f, 81.36f)
                lineTo(174.63f, 12.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(123.56f, 41.12f)
                lineToRelative(-58f, 21.76f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.36f, 75.23f)
                lineTo(34.59f, 199.83f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.77f, 3.49f)
                lineToRelative(57f, -57f)
                arcToRelative(23.85f, 23.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.29f, -12.08f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.6f, 23.4f)
                lineToRelative(-57f, 57f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.49f, 6.77f)
                lineToRelative(124.61f, -20.77f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.35f, -10.16f)
                lineToRelative(21.77f, -58.07f)
                lineTo(243.31f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                close()
                moveTo(208f, 116.68f)
                lineTo(139.32f, 48f)
                lineToRelative(24f, -24f)
                lineTo(232f, 92.68f)
                close()
            }
        }.build()

        return _PenNibFill!!
    }

@Suppress("ObjectPropertyName")
private var _PenNibFill: ImageVector? = null
