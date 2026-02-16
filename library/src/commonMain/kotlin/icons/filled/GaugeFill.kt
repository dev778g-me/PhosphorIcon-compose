package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GaugeFill: ImageVector
    get() {
        if (_GaugeFill != null) {
            return _GaugeFill!!
        }
        _GaugeFill = ImageVector.Builder(
            name = "Filled.GaugeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 152f)
                verticalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(115.93f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.24f, -6.35f)
                lineTo(174.27f, 101f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.37f, -11.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.37f, 1.61f)
                lineToRelative(-72f, 99.06f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 86.25f, 192f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(153.13f)
                curveToRelative(0f, -1.79f, 0f, -3.57f, 0.13f, -5.33f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -3.8f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.73f, 128f)
                horizontalLineTo(23.92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.87f, -5f)
                curveToRelative(12f, -43.84f, 49.66f, -77.13f, 95.52f, -82.28f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.43f, 4f)
                verticalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 71.73f)
                verticalLineTo(44.67f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.43f, -4f)
                arcTo(112.18f, 112.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 236.23f, 123f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.88f, 5f)
                horizontalLineTo(208.27f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.53f)
                horizontalLineToRelative(27.92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3.86f)
                curveTo(240f, 149.23f, 240f, 150.61f, 240f, 152f)
                close()
            }
        }.build()

        return _GaugeFill!!
    }

@Suppress("ObjectPropertyName")
private var _GaugeFill: ImageVector? = null
