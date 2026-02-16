package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MapPinSimpleAreaFill: ImageVector
    get() {
        if (_MapPinSimpleAreaFill != null) {
            return _MapPinSimpleAreaFill!!
        }
        _MapPinSimpleAreaFill = ImageVector.Builder(
            name = "Filled.MapPinSimpleAreaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 39.19f)
                lineTo(136f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 103.19f)
                arcTo(40.05f, 40.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 64f)
                close()
                moveTo(218f, 146.59f)
                curveToRelative(-12.26f, -6.94f, -29.12f, -12.27f, -48.77f, -15.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 166.73f, 147f)
                curveToRelative(17.54f, 2.82f, 33f, 7.63f, 43.42f, 13.55f)
                curveTo(219f, 165.5f, 224f, 171.14f, 224f, 176f)
                curveToRelative(0f, 13.36f, -36.52f, 32f, -96f, 32f)
                reflectiveCurveToRelative(-96f, -18.64f, -96f, -32f)
                curveToRelative(0f, -4.86f, 5f, -10.5f, 13.85f, -15.49f)
                curveToRelative(10.46f, -5.92f, 25.88f, -10.73f, 43.42f, -13.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.54f, -15.79f)
                curveToRelative(-19.65f, 3.15f, -36.51f, 8.48f, -48.77f, 15.42f)
                curveTo(19.81f, 156.87f, 16f, 168.26f, 16f, 176f)
                curveToRelative(0f, 31.18f, 57.71f, 48f, 112f, 48f)
                reflectiveCurveToRelative(112f, -16.82f, 112f, -48f)
                curveTo(240f, 168.26f, 236.19f, 156.87f, 218f, 146.59f)
                close()
            }
        }.build()

        return _MapPinSimpleAreaFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinSimpleAreaFill: ImageVector? = null
