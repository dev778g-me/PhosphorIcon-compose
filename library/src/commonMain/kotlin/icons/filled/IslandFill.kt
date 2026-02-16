package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.IslandFill: ImageVector
    get() {
        if (_IslandFill != null) {
            return _IslandFill!!
        }
        _IslandFill = ImageVector.Builder(
            name = "Filled.IslandFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.55f, 226.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 232f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -14.25f)
                curveToRelative(1.63f, -1.3f, 38.53f, -30.26f, 98.29f, -33.45f)
                arcTo(120f, 120f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114f, 146.37f)
                curveToRelative(1.73f, -21.71f, 10.91f, -50.63f, 42.95f, -72.48f)
                arcToRelative(66.28f, 66.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15f, -1.87f)
                lineToRelative(-1.67f, 0f)
                curveToRelative(-19f, 0.62f, -30.94f, 11.71f, -36.5f, 33.92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 112f)
                arcToRelative(7.66f, 7.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -0.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.82f, -9.7f)
                curveToRelative(9.25f, -36.95f, 33.11f, -45.42f, 51.5f, -46f)
                arcToRelative(81.43f, 81.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.68f, 2.45f)
                curveToRelative(-3.82f, -6.33f, -9.42f, -12.93f, -17.21f, -16.25f)
                curveToRelative(-10f, -4.24f, -22.17f, -2.39f, -36.31f, 5.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.8f, -14f)
                curveToRelative(18.74f, -10.45f, 35.72f, -12.54f, 50.48f, -6.2f)
                curveToRelative(12.49f, 5.36f, 20.73f, 15.78f, 25.88f, 25f)
                curveToRelative(6.17f, -9.64f, 13.87f, -16.17f, 22.38f, -18.94f)
                curveToRelative(11.86f, -3.87f, 24.64f, -0.72f, 38f, 9.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.64f, 12.76f)
                curveToRelative(-8.91f, -6.73f, -16.77f, -9.06f, -23.34f, -6.93f)
                curveToRelative(-7.3f, 2.35f, -12.87f, 10f, -16.38f, 16.61f)
                arcTo(70.46f, 70.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 73.07f)
                curveToRelative(14.61f, 8.35f, 32f, 26.05f, 32f, 62.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                curveToRelative(0f, -23.46f, -8.06f, -40f, -24f, -49f)
                arcToRelative(50.49f, 50.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.75f, -2.8f)
                arcToRelative(55.64f, 55.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.06f, 33.06f)
                arcToRelative(59.41f, 59.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.86f, 23.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.09f, -9.2f)
                curveToRelative(0.75f, -1.09f, 16.33f, -24.38f, -3.26f, -49.37f)
                curveToRelative(-27f, 15.21f, -41.89f, 37.25f, -44.16f, 65.59f)
                arcToRelative(104.27f, 104.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, 36.44f)
                curveToRelative(62.65f, 1.81f, 101.52f, 32.33f, 103.2f, 33.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 239.55f, 226.65f)
                close()
                moveTo(52f, 168f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52f, 168f)
                close()
            }
        }.build()

        return _IslandFill!!
    }

@Suppress("ObjectPropertyName")
private var _IslandFill: ImageVector? = null
