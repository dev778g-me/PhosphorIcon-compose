package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GenderNonbinaryFill: ImageVector
    get() {
        if (_GenderNonbinaryFill != null) {
            return _GenderNonbinaryFill!!
        }
        _GenderNonbinaryFill = ImageVector.Builder(
            name = "Filled.GenderNonbinaryFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(128f, 208f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -103.38f)
                lineTo(120f, 83.82f)
                lineTo(91f, 95.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85f, 80.57f)
                lineTo(106.46f, 72f)
                lineTo(85f, 63.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91f, 48.57f)
                lineToRelative(37f, 14.81f)
                lineToRelative(37f, -14.81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 171f, 63.43f)
                lineTo(149.54f, 72f)
                lineTo(171f, 80.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165f, 95.43f)
                lineTo(136f, 83.82f)
                verticalLineToRelative(20.8f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                close()
                moveTo(164f, 156f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -36f, -36f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 156f)
                close()
            }
        }.build()

        return _GenderNonbinaryFill!!
    }

@Suppress("ObjectPropertyName")
private var _GenderNonbinaryFill: ImageVector? = null
