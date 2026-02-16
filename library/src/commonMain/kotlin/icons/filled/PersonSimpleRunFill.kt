package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PersonSimpleRunFill: ImageVector
    get() {
        if (_PersonSimpleRunFill != null) {
            return _PersonSimpleRunFill!!
        }
        _PersonSimpleRunFill = ImageVector.Builder(
            name = "Filled.PersonSimpleRunFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 56f)
                close()
                moveTo(223.28f, 130.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.6f, -4f)
                curveToRelative(-0.25f, 0.12f, -26.71f, 10.72f, -72.18f, -20.19f)
                curveToRelative(-52.29f, -35.54f, -88f, -7.77f, -89.51f, -6.57f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 12.48f)
                curveToRelative(0.26f, -0.21f, 25.12f, -19.5f, 64.07f, 3.27f)
                curveToRelative(-4.25f, 13.35f, -12.76f, 31.82f, -25.25f, 47f)
                curveToRelative(-18.56f, 22.48f, -41.11f, 32.56f, -67f, 30f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.2f, 208f)
                arcToRelative(92.29f, 92.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.34f, 0.47f)
                curveToRelative(27.38f, 0f, 52f, -12.38f, 71.63f, -36.18f)
                curveToRelative(0.57f, -0.69f, 1.14f, -1.4f, 1.69f, -2.1f)
                curveTo(133.31f, 175.29f, 168f, 190.3f, 168f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                curveToRelative(0f, -24.65f, -10.08f, -45.35f, -29.15f, -59.86f)
                arcToRelative(104.29f, 104.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.31f, -15.81f)
                arcTo(169.31f, 169.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 139f, 124f)
                curveToRelative(26.14f, 16.09f, 46.84f, 20f, 60.69f, 20f)
                curveToRelative(12.18f, 0f, 19.06f, -3f, 19.67f, -3.28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.28f, 130.08f)
                close()
            }
        }.build()

        return _PersonSimpleRunFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleRunFill: ImageVector? = null
