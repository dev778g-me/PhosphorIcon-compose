package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MapPinAreaFill: ImageVector
    get() {
        if (_MapPinAreaFill != null) {
            return _MapPinAreaFill!!
        }
        _MapPinAreaFill = ImageVector.Builder(
            name = "Filled.MapPinAreaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(124f, 175f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.94f, 0f)
                curveToRelative(2.45f, -1.41f, 60f, -35f, 60f, -94.95f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 80f)
                curveTo(64f, 140f, 121.58f, 173.54f, 124f, 175f)
                close()
                moveTo(128f, 56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 56f)
                close()
                moveTo(240f, 184f)
                curveToRelative(0f, 31.18f, -57.71f, 48f, -112f, 48f)
                reflectiveCurveTo(16f, 215.18f, 16f, 184f)
                curveToRelative(0f, -14.59f, 13.22f, -27.51f, 37.23f, -36.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.54f, 15f)
                curveTo(42.26f, 168.74f, 32f, 176.92f, 32f, 184f)
                curveToRelative(0f, 13.36f, 36.52f, 32f, 96f, 32f)
                reflectiveCurveToRelative(96f, -18.64f, 96f, -32f)
                curveToRelative(0f, -7.08f, -10.26f, -15.26f, -26.77f, -21.36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.54f, -15f)
                curveTo(226.78f, 156.49f, 240f, 169.41f, 240f, 184f)
                close()
            }
        }.build()

        return _MapPinAreaFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinAreaFill: ImageVector? = null
