package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PottedPlantFill: ImageVector
    get() {
        if (_PottedPlantFill != null) {
            return _PottedPlantFill!!
        }
        _PottedPlantFill = ImageVector.Builder(
            name = "Filled.PottedPlantFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 144f)
                horizontalLineToRelative(-76.7f)
                lineToRelative(22.41f, -22.41f)
                arcToRelative(59.55f, 59.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.1f, 6.36f)
                arcToRelative(49.56f, 49.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.89f, -7.22f)
                curveToRelative(23.72f, -14.36f, 36.43f, -47.6f, 34f, -88.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.52f, -7.52f)
                curveToRelative(-41.32f, -2.43f, -74.56f, 10.28f, -88.93f, 34f)
                curveToRelative(-9.35f, 15.45f, -9.59f, 34.11f, -0.86f, 52f)
                lineTo(120f, 124.68f)
                lineToRelative(-12.21f, -12.21f)
                curveToRelative(6f, -13.25f, 5.57f, -27f, -1.39f, -38.48f)
                curveTo(95.53f, 56f, 70.61f, 46.41f, 39.73f, 48.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.51f, 7.51f)
                curveTo(30.4f, 86.6f, 40f, 111.52f, 58f, 122.4f)
                arcTo(38.22f, 38.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78f, 128f)
                arcToRelative(45f, 45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.52f, -4.19f)
                lineTo(108.69f, 136f)
                lineToRelative(-8f, 8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(9.59f)
                lineTo(78.8f, 219.47f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94.42f, 232f)
                horizontalLineToRelative(67.17f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.62f, -12.53f)
                lineTo(190.42f, 160f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _PottedPlantFill!!
    }

@Suppress("ObjectPropertyName")
private var _PottedPlantFill: ImageVector? = null
