package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.VignetteFill: ImageVector
    get() {
        if (_VignetteFill != null) {
            return _VignetteFill!!
        }
        _VignetteFill = ImageVector.Builder(
            name = "Filled.VignetteFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(200f, 128f)
                curveToRelative(0f, 30.93f, -32.24f, 56f, -72f, 56f)
                reflectiveCurveToRelative(-72f, -25.07f, -72f, -56f)
                reflectiveCurveToRelative(32.24f, -56f, 72f, -56f)
                reflectiveCurveTo(200f, 97.07f, 200f, 128f)
                close()
            }
        }.build()

        return _VignetteFill!!
    }

@Suppress("ObjectPropertyName")
private var _VignetteFill: ImageVector? = null
