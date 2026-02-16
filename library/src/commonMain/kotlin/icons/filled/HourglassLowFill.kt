package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HourglassLowFill: ImageVector
    get() {
        if (_HourglassLowFill != null) {
            return _HourglassLowFill!!
        }
        _HourglassLowFill = ImageVector.Builder(
            name = "Filled.HourglassLowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 75.64f)
                verticalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                verticalLineTo(76f)
                arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 12.8f)
                lineTo(114.67f, 128f)
                lineTo(62.4f, 167.2f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 180f)
                verticalLineToRelative(36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(180.36f)
                arcToRelative(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.35f, -12.76f)
                lineTo(141.27f, 128f)
                lineToRelative(52.38f, -39.59f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 75.64f)
                close()
                moveTo(178.23f, 176f)
                horizontalLineTo(77.33f)
                lineTo(128f, 138f)
                close()
                moveTo(184f, 75.64f)
                lineTo(128f, 118f)
                lineTo(72f, 76f)
                verticalLineTo(40f)
                horizontalLineTo(184f)
                close()
            }
        }.build()

        return _HourglassLowFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassLowFill: ImageVector? = null
