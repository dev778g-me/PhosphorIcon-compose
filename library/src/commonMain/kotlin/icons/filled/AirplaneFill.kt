package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AirplaneFill: ImageVector
    get() {
        if (_AirplaneFill != null) {
            return _AirplaneFill!!
        }
        _AirplaneFill = ImageVector.Builder(
            name = "Filled.AirplaneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 136f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                arcToRelative(7.61f, 7.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -0.16f)
                lineTo(156f, 161f)
                verticalLineToRelative(23.73f)
                lineToRelative(17.66f, 17.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 208f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, 7.43f)
                lineToRelative(-37f, -14.81f)
                lineTo(91f, 239.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 232f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -5.66f)
                lineTo(100f, 184.69f)
                verticalLineTo(161f)
                lineTo(25.57f, 175.84f)
                arcTo(7.61f, 7.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.42f, -7.16f)
                lineTo(100f, 89.06f)
                verticalLineTo(44f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 0f)
                verticalLineTo(89.06f)
                lineToRelative(79.58f, 39.78f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 136f)
                close()
            }
        }.build()

        return _AirplaneFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneFill: ImageVector? = null
