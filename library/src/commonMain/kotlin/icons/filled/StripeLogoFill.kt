package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StripeLogoFill: ImageVector
    get() {
        if (_StripeLogoFill != null) {
            return _StripeLogoFill!!
        }
        _StripeLogoFill = ImageVector.Builder(
            name = "Filled.StripeLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(128f, 184f)
                curveToRelative(-22.06f, 0f, -40f, -14.35f, -40f, -32f)
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
                curveTo(168f, 169.65f, 150.06f, 184f, 128f, 184f)
                close()
            }
        }.build()

        return _StripeLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _StripeLogoFill: ImageVector? = null
