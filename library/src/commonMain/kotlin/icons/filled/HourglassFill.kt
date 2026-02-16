package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HourglassFill: ImageVector
    get() {
        if (_HourglassFill != null) {
            return _HourglassFill!!
        }
        _HourglassFill = ImageVector.Builder(
            name = "Filled.HourglassFill",
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
                arcToRelative(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.41f, 12.8f)
                lineTo(114.67f, 128f)
                lineTo(62.4f, 167.2f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 180f)
                verticalLineToRelative(36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(180.36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.36f, -12.77f)
                lineTo(141.26f, 128f)
                lineToRelative(52.38f, -39.59f)
                arcTo(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 75.64f)
                close()
            }
        }.build()

        return _HourglassFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassFill: ImageVector? = null
