package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EyeFill: ImageVector
    get() {
        if (_EyeFill != null) {
            return _EyeFill!!
        }
        _EyeFill = ImageVector.Builder(
            name = "Filled.EyeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.31f, 124.76f)
                curveToRelative(-0.35f, -0.79f, -8.82f, -19.58f, -27.65f, -38.41f)
                curveTo(194.57f, 61.26f, 162.88f, 48f, 128f, 48f)
                reflectiveCurveTo(61.43f, 61.26f, 36.34f, 86.35f)
                curveTo(17.51f, 105.18f, 9f, 124f, 8.69f, 124.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f)
                curveTo(61.43f, 194.74f, 93.12f, 208f, 128f, 208f)
                reflectiveCurveToRelative(66.57f, -13.26f, 91.66f, -38.34f)
                curveToRelative(18.83f, -18.83f, 27.3f, -37.61f, 27.65f, -38.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.31f, 124.76f)
                close()
                moveTo(128f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                close()
            }
        }.build()

        return _EyeFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyeFill: ImageVector? = null
