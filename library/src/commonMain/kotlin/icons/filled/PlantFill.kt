package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PlantFill: ImageVector
    get() {
        if (_PlantFill != null) {
            return _PlantFill!!
        }
        _PlantFill = ImageVector.Builder(
            name = "Filled.PlantFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(205.41f, 159.07f)
                arcToRelative(60.9f, 60.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -31.83f, 8.86f)
                arcToRelative(71.71f, 71.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -27.36f, -5.66f)
                arcTo(55.55f, 55.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 194.51f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, 8f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, -8.25f)
                verticalLineTo(211.31f)
                lineTo(81.38f, 172.69f)
                arcTo(52.5f, 52.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.44f, 176f)
                arcToRelative(45.82f, 45.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -23.92f, -6.67f)
                curveTo(17.73f, 156.09f, 6f, 125.62f, 8.27f, 87.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.52f, -7.52f)
                curveToRelative(37.83f, -2.23f, 68.3f, 9.46f, 81.5f, 31.25f)
                arcTo(46f, 46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.74f, 140f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.89f, 2.43f)
                lineToRelative(-19.2f, -20.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 11.31f)
                lineToRelative(53.88f, 55.25f)
                curveToRelative(0.06f, -0.78f, 0.13f, -1.56f, 0.21f, -2.33f)
                arcToRelative(68.56f, 68.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.64f, -39.46f)
                lineToRelative(50.59f, -53.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, -11.32f)
                lineToRelative(-49f, 51.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.78f, -1.74f)
                curveToRelative(-4.74f, -17.48f, -2.65f, -34.88f, 6.4f, -49.82f)
                curveToRelative(17.86f, -29.48f, 59.42f, -45.26f, 111.18f, -42.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.52f, 7.52f)
                curveTo(250.67f, 99.65f, 234.89f, 141.21f, 205.41f, 159.07f)
                close()
            }
        }.build()

        return _PlantFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlantFill: ImageVector? = null
