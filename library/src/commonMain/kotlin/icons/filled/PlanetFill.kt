package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PlanetFill: ImageVector
    get() {
        if (_PlanetFill != null) {
            return _PlanetFill!!
        }
        _PlanetFill = ImageVector.Builder(
            name = "Filled.PlanetFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.11f, 60.68f)
                curveToRelative(-7.65f, -13.19f, -27.85f, -16.16f, -58.5f, -8.66f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.81f, 140.3f)
                curveTo(5.09f, 169f, 5.49f, 186f, 10.9f, 195.32f)
                curveTo(16f, 204.16f, 26.64f, 208f, 40.64f, 208f)
                arcToRelative(124.11f, 124.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.79f, -4f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 153.78f, -88.25f)
                curveToRelative(12.51f, -13f, 20.83f, -25.35f, 23.66f, -35.92f)
                curveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f)
                close()
                moveTo(231.42f, 75.68f)
                curveToRelative(-6.11f, 22.78f, -48.65f, 57.31f, -87.52f, 79.64f)
                curveToRelative(-67.81f, 39f, -113.62f, 41.52f, -119.16f, 32f)
                curveToRelative(-1.46f, -2.51f, -0.65f, -7.24f, 2.22f, -13f)
                arcToRelative(80.06f, 80.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.28f, -15.05f)
                arcToRelative(95.53f, 95.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.23f, 14.18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 2.12f)
                arcToRelative(122.14f, 122.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.95f, -3.32f)
                curveToRelative(21.23f, -5.55f, 46.63f, -16.48f, 71.52f, -30.78f)
                reflectiveCurveToRelative(47f, -30.66f, 62.45f, -46.15f)
                arcTo(122.74f, 122.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 209.7f, 82.45f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, -4.52f)
                arcToRelative(96.26f, 96.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.1f, -12.46f)
                curveToRelative(14.21f, -2.35f, 27.37f, -2.17f, 30.5f, 3.24f)
                curveTo(232.19f, 70.28f, 232.24f, 72.63f, 231.42f, 75.69f)
                close()
            }
        }.build()

        return _PlanetFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlanetFill: ImageVector? = null
