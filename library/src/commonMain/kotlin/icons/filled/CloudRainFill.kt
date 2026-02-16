package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CloudRainFill: ImageVector
    get() {
        if (_CloudRainFill != null) {
            return _CloudRainFill!!
        }
        _CloudRainFill = ImageVector.Builder(
            name = "Filled.CloudRainFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(158.66f, 196.44f)
                lineToRelative(-32f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.32f, -8.88f)
                lineToRelative(32f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.32f, 8.88f)
                close()
                moveTo(231.87f, 87.55f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -151.78f, 0.73f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 96f)
                lineToRelative(-0.6f, 0f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 87.39f)
                arcToRelative(92.48f, 92.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, -16.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -4.78f)
                arcTo(52.09f, 52.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 116.36f)
                curveTo(24.2f, 145.07f, 48.12f, 168f, 76.84f, 168f)
                horizontalLineToRelative(36.21f)
                lineTo(89.34f, 203.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.32f, 8.88f)
                lineTo(132.28f, 168f)
                horizontalLineTo(156f)
                arcTo(76.08f, 76.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.87f, 87.55f)
                close()
            }
        }.build()

        return _CloudRainFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRainFill: ImageVector? = null
