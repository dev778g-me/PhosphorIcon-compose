package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AppleLogoFill: ImageVector
    get() {
        if (_AppleLogoFill != null) {
            return _AppleLogoFill!!
        }
        _AppleLogoFill = ImageVector.Builder(
            name = "Filled.AppleLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128.23f, 30f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 167f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineToRelative(-1f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.24f, 18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15.5f, -4f)
                close()
                moveTo(223.3f, 169.59f)
                arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.8f, -3.4f)
                curveTo(203.53f, 154.53f, 200f, 134.64f, 200f, 120f)
                curveToRelative(0f, -17.67f, 13.47f, -33.06f, 21.5f, -40.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.62f)
                curveTo(208.82f, 55.74f, 187.82f, 48f, 168f, 48f)
                arcToRelative(72.23f, 72.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 12.13f)
                arcToRelative(71.56f, 71.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -90.71f, 9.09f)
                arcTo(74.63f, 74.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 123.4f)
                arcToRelative(127f, 127f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.14f, 89.73f)
                arcTo(39.8f, 39.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.59f, 224f)
                horizontalLineToRelative(87.68f)
                arcToRelative(39.84f, 39.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.12f, -12.57f)
                arcToRelative(125f, 125f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.82f, -24.6f)
                curveTo(225.23f, 174f, 224.33f, 172f, 223.3f, 169.59f)
                close()
            }
        }.build()

        return _AppleLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _AppleLogoFill: ImageVector? = null
