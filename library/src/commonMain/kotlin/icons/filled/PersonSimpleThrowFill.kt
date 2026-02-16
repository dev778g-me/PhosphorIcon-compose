package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PersonSimpleThrowFill: ImageVector
    get() {
        if (_PersonSimpleThrowFill != null) {
            return _PersonSimpleThrowFill!!
        }
        _PersonSimpleThrowFill = ImageVector.Builder(
            name = "Filled.PersonSimpleThrowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 56f)
                close()
                moveTo(221f, 99.36f)
                curveToRelative(-1.5f, -1.2f, -37.22f, -29f, -89.51f, 6.57f)
                curveTo(86f, 136.84f, 59.57f, 126.23f, 59.32f, 126.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.63f, 14.56f)
                curveToRelative(0.61f, 0.28f, 7.49f, 3.27f, 19.67f, 3.27f)
                curveToRelative(14.21f, 0f, 35.64f, -4.11f, 62.77f, -21.29f)
                curveToRelative(-2.28f, 29.41f, -12.73f, 83.47f, -73.43f, 101.68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.6f, 15.32f)
                curveToRelative(34.83f, -10.45f, 59.45f, -32.34f, 73.2f, -65.08f)
                arcToRelative(141.86f, 141.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.1f, -14.33f)
                lineToRelative(22.08f, 18.4f)
                lineToRelative(-14.27f, 42.82f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.18f, 5.06f)
                lineToRelative(16f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.47f, -8.68f)
                lineToRelative(-32.42f, -27f)
                arcToRelative(215.91f, 215.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -30.34f)
                curveToRelative(36.18f, -18.57f, 59f, -0.85f, 59.28f, -0.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, -12.48f)
                close()
                moveTo(64f, 112f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 112f)
                close()
            }
        }.build()

        return _PersonSimpleThrowFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleThrowFill: ImageVector? = null
