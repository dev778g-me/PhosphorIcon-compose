package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SkypeLogoFill: ImageVector
    get() {
        if (_SkypeLogoFill != null) {
            return _SkypeLogoFill!!
        }
        _SkypeLogoFill = ImageVector.Builder(
            name = "Filled.SkypeLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(222.53f, 144.83f)
                arcTo(96.09f, 96.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 111.17f, 33.47f)
                arcTo(55.38f, 55.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 24f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                arcToRelative(55.38f, 55.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.47f, 31.17f)
                arcTo(96.09f, 96.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144.83f, 222.53f)
                arcTo(55.38f, 55.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 232f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
                arcTo(55.38f, 55.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.53f, 144.83f)
                close()
                moveTo(128f, 184f)
                curveToRelative(-22.06f, 0f, -40f, -14.36f, -40f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                curveToRelative(0f, 8.67f, 11f, 16f, 24f, 16f)
                reflectiveCurveToRelative(24f, -7.33f, 24f, -16f)
                curveToRelative(0f, -9.48f, -8.61f, -13f, -26.88f, -18.26f)
                curveTo(109.37f, 129.2f, 89.78f, 123.55f, 89.78f, 104f)
                curveToRelative(0f, -18.24f, 16.43f, -32f, 38.22f, -32f)
                curveToRelative(15.72f, 0f, 29.18f, 7.3f, 35.12f, 19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.27f, 7.22f)
                curveTo(145.64f, 91.94f, 137.65f, 88f, 128f, 88f)
                curveToRelative(-12.67f, 0f, -22.22f, 6.88f, -22.22f, 16f)
                curveToRelative(0f, 7f, 9f, 10.1f, 23.77f, 14.36f)
                curveTo(145.78f, 123f, 168f, 129.45f, 168f, 152f)
                curveTo(168f, 169.64f, 150.06f, 184f, 128f, 184f)
                close()
            }
        }.build()

        return _SkypeLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SkypeLogoFill: ImageVector? = null
