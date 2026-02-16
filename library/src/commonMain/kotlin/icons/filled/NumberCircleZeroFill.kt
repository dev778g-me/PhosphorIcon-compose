package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberCircleZeroFill: ImageVector
    get() {
        if (_NumberCircleZeroFill != null) {
            return _NumberCircleZeroFill!!
        }
        _NumberCircleZeroFill = ImageVector.Builder(
            name = "Filled.NumberCircleZeroFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 128f)
                curveToRelative(0f, 14.86f, -5.9f, 40f, -28f, 40f)
                reflectiveCurveToRelative(-28f, -25.14f, -28f, -40f)
                reflectiveCurveToRelative(5.9f, -40f, 28f, -40f)
                reflectiveCurveTo(156f, 113.14f, 156f, 128f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(172f, 128f)
                curveToRelative(0f, -14.25f, -3.56f, -27.53f, -10f, -37.39f)
                curveTo(154f, 78.44f, 142.23f, 72f, 128f, 72f)
                reflectiveCurveToRelative(-26f, 6.44f, -34f, 18.61f)
                curveToRelative(-6.47f, 9.86f, -10f, 23.14f, -10f, 37.39f)
                reflectiveCurveToRelative(3.56f, 27.53f, 10f, 37.39f)
                curveToRelative(8f, 12.18f, 19.74f, 18.61f, 34f, 18.61f)
                reflectiveCurveToRelative(26f, -6.43f, 34f, -18.61f)
                curveTo(168.44f, 155.53f, 172f, 142.25f, 172f, 128f)
                close()
            }
        }.build()

        return _NumberCircleZeroFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleZeroFill: ImageVector? = null
