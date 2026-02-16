package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandPointingFill: ImageVector
    get() {
        if (_HandPointingFill != null) {
            return _HandPointingFill!!
        }
        _HandPointingFill = ImageVector.Builder(
            name = "Filled.HandPointingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 104f)
                verticalLineToRelative(50.93f)
                curveToRelative(0f, 46.2f, -36.85f, 84.55f, -83f, 85.06f)
                arcTo(83.71f, 83.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.6f, 215.4f)
                curveTo(58.79f, 192.33f, 34.15f, 136f, 34.15f, 136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.53f, -22.23f)
                curveToRelative(7.66f, -4f, 17.1f, -0.84f, 21.4f, 6.62f)
                lineToRelative(21f, 36.44f)
                arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.09f)
                lineToRelative(0.12f, 0f)
                arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 151.74f)
                verticalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.77f, -16f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                verticalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                verticalLineTo(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.77f, -16f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                verticalLineTo(112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                verticalLineToRelative(-7.28f)
                curveToRelative(0f, -8.61f, 6.62f, -16f, 15.23f, -16.43f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 104f)
                close()
            }
        }.build()

        return _HandPointingFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingFill: ImageVector? = null
