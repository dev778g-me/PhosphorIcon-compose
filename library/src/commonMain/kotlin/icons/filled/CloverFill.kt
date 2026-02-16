package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CloverFill: ImageVector
    get() {
        if (_CloverFill != null) {
            return _CloverFill!!
        }
        _CloverFill = ImageVector.Builder(
            name = "Filled.CloverFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228f, 120f)
                curveToRelative(0f, 22.63f, -6f, 36.72f, -17.93f, 41.87f)
                arcToRelative(27.3f, 27.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, 2.13f)
                arcToRelative(41.75f, 41.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.4f, -0.93f)
                arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.52f, -1.64f)
                arcToRelative(368.49f, 368.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -47.75f, -55.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, 11.62f)
                curveToRelative(14.84f, 13.91f, 64.13f, 63.49f, 78.32f, 120.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.82f, 9.7f)
                arcTo(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 248f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.75f, -6.06f)
                curveToRelative(-4.12f, -16.47f, -11.65f, -32.48f, -20.46f, -47.09f)
                arcToRelative(25.85f, 25.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.9f, 7.21f)
                curveTo(164.72f, 214f, 150.63f, 220f, 128f, 220f)
                reflectiveCurveToRelative(-36.72f, -6f, -41.88f, -17.94f)
                curveToRelative(-5.45f, -12.58f, -0.39f, -30.82f, 15f, -54.21f)
                curveToRelative(0.68f, -1f, 1.36f, -2f, 2f, -3f)
                lineToRelative(-3f, 2f)
                curveTo(82.84f, 158.27f, 68.35f, 164f, 56.89f, 164f)
                arcToRelative(27.3f, 27.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, -2.13f)
                curveTo(34f, 156.72f, 28f, 142.63f, 28f, 120f)
                reflectiveCurveToRelative(6f, -36.72f, 17.93f, -41.88f)
                curveToRelative(12.59f, -5.45f, 30.83f, -0.39f, 54.22f, 15f)
                lineToRelative(3f, 2f)
                quadToRelative(-1f, -1.5f, -2f, -3f)
                curveToRelative(-15.41f, -23.39f, -20.47f, -41.63f, -15f, -54.22f)
                curveTo(91.28f, 26f, 105.37f, 20f, 128f, 20f)
                reflectiveCurveToRelative(36.72f, 6f, 41.88f, 17.93f)
                curveToRelative(5.45f, 12.59f, 0.39f, 30.83f, -15f, 54.22f)
                quadToRelative(-1f, 1.53f, -2f, 3f)
                lineToRelative(3f, -2f)
                curveToRelative(23.39f, -15.41f, 41.63f, -20.47f, 54.22f, -15f)
                curveTo(222f, 83.28f, 228f, 97.37f, 228f, 120f)
                close()
            }
        }.build()

        return _CloverFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloverFill: ImageVector? = null
