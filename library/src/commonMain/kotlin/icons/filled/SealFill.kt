package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SealFill: ImageVector
    get() {
        if (_SealFill != null) {
            return _SealFill!!
        }
        _SealFill = ImageVector.Builder(
            name = "Filled.SealFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 128f)
                curveToRelative(0f, 10.44f, -7.51f, 18.27f, -14.14f, 25.18f)
                curveToRelative(-3.77f, 3.94f, -7.67f, 8f, -9.14f, 11.57f)
                curveToRelative(-1.36f, 3.27f, -1.44f, 8.69f, -1.52f, 13.94f)
                curveToRelative(-0.15f, 9.76f, -0.31f, 20.82f, -8f, 28.51f)
                reflectiveCurveToRelative(-18.75f, 7.85f, -28.51f, 8f)
                curveToRelative(-5.25f, 0.08f, -10.67f, 0.16f, -13.94f, 1.52f)
                curveToRelative(-3.57f, 1.47f, -7.63f, 5.37f, -11.57f, 9.14f)
                curveTo(146.27f, 232.49f, 138.44f, 240f, 128f, 240f)
                reflectiveCurveToRelative(-18.27f, -7.51f, -25.18f, -14.14f)
                curveToRelative(-3.94f, -3.77f, -8f, -7.67f, -11.57f, -9.14f)
                curveToRelative(-3.27f, -1.36f, -8.69f, -1.44f, -13.94f, -1.52f)
                curveToRelative(-9.76f, -0.15f, -20.82f, -0.31f, -28.51f, -8f)
                reflectiveCurveToRelative(-7.85f, -18.75f, -8f, -28.51f)
                curveToRelative(-0.08f, -5.25f, -0.16f, -10.67f, -1.52f, -13.94f)
                curveToRelative(-1.47f, -3.57f, -5.37f, -7.63f, -9.14f, -11.57f)
                curveTo(23.51f, 146.27f, 16f, 138.44f, 16f, 128f)
                reflectiveCurveToRelative(7.51f, -18.27f, 14.14f, -25.18f)
                curveToRelative(3.77f, -3.94f, 7.67f, -8f, 9.14f, -11.57f)
                curveToRelative(1.36f, -3.27f, 1.44f, -8.69f, 1.52f, -13.94f)
                curveToRelative(0.15f, -9.76f, 0.31f, -20.82f, 8f, -28.51f)
                reflectiveCurveToRelative(18.75f, -7.85f, 28.51f, -8f)
                curveToRelative(5.25f, -0.08f, 10.67f, -0.16f, 13.94f, -1.52f)
                curveToRelative(3.57f, -1.47f, 7.63f, -5.37f, 11.57f, -9.14f)
                curveTo(109.73f, 23.51f, 117.56f, 16f, 128f, 16f)
                reflectiveCurveToRelative(18.27f, 7.51f, 25.18f, 14.14f)
                curveToRelative(3.94f, 3.77f, 8f, 7.67f, 11.57f, 9.14f)
                curveToRelative(3.27f, 1.36f, 8.69f, 1.44f, 13.94f, 1.52f)
                curveToRelative(9.76f, 0.15f, 20.82f, 0.31f, 28.51f, 8f)
                reflectiveCurveToRelative(7.85f, 18.75f, 8f, 28.51f)
                curveToRelative(0.08f, 5.25f, 0.16f, 10.67f, 1.52f, 13.94f)
                curveToRelative(1.47f, 3.57f, 5.37f, 7.63f, 9.14f, 11.57f)
                curveTo(232.49f, 109.73f, 240f, 117.56f, 240f, 128f)
                close()
            }
        }.build()

        return _SealFill!!
    }

@Suppress("ObjectPropertyName")
private var _SealFill: ImageVector? = null
