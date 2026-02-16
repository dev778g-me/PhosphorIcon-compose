package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CoffeeBeanFill: ImageVector
    get() {
        if (_CoffeeBeanFill != null) {
            return _CoffeeBeanFill!!
        }
        _CoffeeBeanFill = ImageVector.Builder(
            name = "Filled.CoffeeBeanFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(71.22f, 190.47f)
                arcToRelative(108.88f, 108.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.84f, 9.16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.89f, -2f)
                curveToRelative(-8.67f, -15.28f, -11.52f, -34.29f, -8f, -55.15f)
                curveToRelative(4.49f, -26.92f, 19.09f, -53.87f, 41.12f, -75.9f)
                reflectiveCurveToRelative(49f, -36.63f, 75.9f, -41.12f)
                curveToRelative(22.79f, -3.79f, 43.37f, 0f, 59.29f, 10.6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.25f, 7.23f)
                arcToRelative(121f, 121f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.82f, 7.46f)
                curveToRelative(-21.77f, 9.9f, -49.6f, 31.06f, -58.52f, 75.7f)
                curveTo(114.1f, 156.73f, 97.63f, 178.27f, 71.22f, 190.47f)
                close()
                moveTo(222.51f, 58.38f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.88f, -2f)
                arcToRelative(108.5f, 108.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.85f, 9.16f)
                curveToRelative(-26.41f, 12.2f, -42.88f, 33.74f, -48.94f, 64f)
                curveToRelative(-8.93f, 44.64f, -36.75f, 65.8f, -58.52f, 75.7f)
                arcToRelative(121f, 121f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.82f, 7.46f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.27f, 220f)
                curveToRelative(11.87f, 7.92f, 26.32f, 12f, 42.35f, 12f)
                arcToRelative(103.66f, 103.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.92f, -1.44f)
                curveToRelative(26.91f, -4.49f, 53.87f, -19.09f, 75.9f, -41.12f)
                reflectiveCurveToRelative(36.63f, -49f, 41.12f, -75.9f)
                curveTo(234f, 92.68f, 231.18f, 73.66f, 222.51f, 58.38f)
                close()
            }
        }.build()

        return _CoffeeBeanFill!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeBeanFill: ImageVector? = null
