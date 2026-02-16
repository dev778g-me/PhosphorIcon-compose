package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HairDryerFill: ImageVector
    get() {
        if (_HairDryerFill != null) {
            return _HairDryerFill!!
        }
        _HairDryerFill = ImageVector.Builder(
            name = "Filled.HairDryerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(177.42f, 206.62f)
                lineTo(209f, 137.07f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 24f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 0.11f)
                lineTo(29.37f, 47f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 62.78f)
                verticalLineToRelative(50.44f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.37f, 129f)
                lineTo(128f, 145.44f)
                lineTo(128f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(184f, 240f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                horizontalLineToRelative(2.85f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 177.42f, 206.62f)
                close()
                moveTo(192f, 88f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 88f)
                close()
                moveTo(166.68f, 151.89f)
                arcTo(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 152f)
                arcToRelative(63.9f, 63.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.82f, -2.54f)
                lineToRelative(-23f, 50.54f)
                lineTo(144f, 200f)
                lineTo(144f, 148.11f)
                close()
            }
        }.build()

        return _HairDryerFill!!
    }

@Suppress("ObjectPropertyName")
private var _HairDryerFill: ImageVector? = null
