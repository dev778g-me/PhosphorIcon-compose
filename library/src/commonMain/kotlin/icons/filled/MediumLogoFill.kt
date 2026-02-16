package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MediumLogoFill: ImageVector
    get() {
        if (_MediumLogoFill != null) {
            return _MediumLogoFill!!
        }
        _MediumLogoFill = ImageVector.Builder(
            name = "Filled.MediumLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 128f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 64f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 128f)
                close()
                moveTo(184f, 64f)
                curveToRelative(-5.68f, 0f, -16.4f, 2.76f, -24.32f, 21.25f)
                curveTo(154.73f, 96.8f, 152f, 112f, 152f, 128f)
                reflectiveCurveToRelative(2.73f, 31.2f, 7.68f, 42.75f)
                curveTo(167.6f, 189.24f, 178.32f, 192f, 184f, 192f)
                reflectiveCurveToRelative(16.4f, -2.76f, 24.32f, -21.25f)
                curveTo(213.27f, 159.2f, 216f, 144f, 216f, 128f)
                reflectiveCurveToRelative(-2.73f, -31.2f, -7.68f, -42.75f)
                curveTo(200.4f, 66.76f, 189.68f, 64f, 184f, 64f)
                close()
                moveTo(240f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(232f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(248f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 64f)
                close()
            }
        }.build()

        return _MediumLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MediumLogoFill: ImageVector? = null
