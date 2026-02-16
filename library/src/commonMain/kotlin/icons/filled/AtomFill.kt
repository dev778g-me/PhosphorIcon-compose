package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AtomFill: ImageVector
    get() {
        if (_AtomFill != null) {
            return _AtomFill!!
        }
        _AtomFill = ImageVector.Builder(
            name = "Filled.AtomFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(196.12f, 128f)
                curveToRelative(24.65f, -34.61f, 37.22f, -70.38f, 19.74f, -87.86f)
                reflectiveCurveTo(162.61f, 35.23f, 128f, 59.88f)
                curveTo(93.39f, 35.23f, 57.62f, 22.66f, 40.14f, 40.14f)
                reflectiveCurveTo(35.23f, 93.39f, 59.88f, 128f)
                curveToRelative(-24.65f, 34.61f, -37.22f, 70.38f, -19.74f, 87.86f)
                horizontalLineToRelative(0f)
                curveToRelative(5.63f, 5.63f, 13.15f, 8.14f, 21.91f, 8.14f)
                curveToRelative(18.47f, 0f, 42.48f, -11.17f, 66f, -27.88f)
                curveTo(151.47f, 212.83f, 175.47f, 224f, 194f, 224f)
                curveToRelative(8.76f, 0f, 16.29f, -2.52f, 21.91f, -8.14f)
                horizontalLineToRelative(0f)
                curveTo(233.34f, 198.38f, 220.77f, 162.61f, 196.12f, 128f)
                close()
                moveTo(204.55f, 51.45f)
                curveToRelative(7.64f, 7.64f, 2.48f, 32.4f, -18.52f, 63.28f)
                arcToRelative(300.33f, 300.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.19f, -23.57f)
                arcTo(302.47f, 302.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 141.27f, 70f)
                curveTo(172.15f, 49f, 196.91f, 43.81f, 204.55f, 51.45f)
                close()
                moveTo(51.45f, 51.45f)
                curveToRelative(2.2f, -2.21f, 5.83f, -3.35f, 10.62f, -3.35f)
                curveTo(73.89f, 48.1f, 92.76f, 55f, 114.72f, 70f)
                arcTo(304f, 304f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.16f, 91.16f)
                arcTo(300.33f, 300.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 70f, 114.73f)
                curveTo(49f, 83.85f, 43.81f, 59.09f, 51.45f, 51.45f)
                close()
                moveTo(51.45f, 204.55f)
                curveTo(43.81f, 196.91f, 49f, 172.15f, 70f, 141.27f)
                arcToRelative(300.33f, 300.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.19f, 23.57f)
                arcTo(304.18f, 304.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 114.73f, 186f)
                curveTo(83.85f, 207f, 59.09f, 212.19f, 51.45f, 204.55f)
                close()
                moveTo(128f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                close()
                moveTo(204.55f, 204.56f)
                curveToRelative(-7.64f, 7.65f, -32.4f, 2.48f, -63.28f, -18.52f)
                arcToRelative(304.18f, 304.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.57f, -21.19f)
                arcTo(300.33f, 300.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186f, 141.27f)
                curveTo(207f, 172.15f, 212.19f, 196.91f, 204.55f, 204.55f)
                close()
            }
        }.build()

        return _AtomFill!!
    }

@Suppress("ObjectPropertyName")
private var _AtomFill: ImageVector? = null
