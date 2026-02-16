package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.OnigiriFill: ImageVector
    get() {
        if (_OnigiriFill != null) {
            return _OnigiriFill!!
        }
        _OnigiriFill = ImageVector.Builder(
            name = "Filled.OnigiriFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.53f, 146.57f)
                lineTo(175.68f, 50.66f)
                lineToRelative(-0.11f, -0.19f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -95.14f, 0f)
                lineToRelative(-0.11f, 0.19f)
                lineTo(24.47f, 146.57f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.09f, 232f)
                lineTo(183.91f, 232f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.62f, -85.43f)
                close()
                moveTo(218.85f, 195.45f)
                arcTo(39.49f, 39.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.91f, 216f)
                lineTo(176f, 216f)
                lineTo(176f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(96f, 152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(48f)
                lineTo(72.09f, 216f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -34f, -61.09f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.11f, -0.2f)
                lineToRelative(55.85f, -95.9f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.84f, 0f)
                lineToRelative(55.85f, 95.9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.11f, 0.2f)
                arcTo(39.5f, 39.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 218.85f, 195.45f)
                close()
            }
        }.build()

        return _OnigiriFill!!
    }

@Suppress("ObjectPropertyName")
private var _OnigiriFill: ImageVector? = null
