package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GolfFill: ImageVector
    get() {
        if (_GolfFill != null) {
            return _GolfFill!!
        }
        _GolfFill = ImageVector.Builder(
            name = "Filled.GolfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(175.47f, 197.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.61f, 10.33f)
                arcTo(125.91f, 125.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 215.68f)
                lineTo(136f, 248f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 215.68f)
                arcToRelative(125.91f, 125.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -34.86f, -8.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.72f, -14.94f)
                curveTo(104f, 197.56f, 116.15f, 200f, 128f, 200f)
                reflectiveCurveToRelative(24f, -2.44f, 37.14f, -7.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 175.47f, 197.14f)
                close()
                moveTo(216f, 96f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 8f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 96f)
                close()
                moveTo(144f, 132f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 132f)
                close()
                moveTo(176f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 100f)
                close()
            }
        }.build()

        return _GolfFill!!
    }

@Suppress("ObjectPropertyName")
private var _GolfFill: ImageVector? = null
