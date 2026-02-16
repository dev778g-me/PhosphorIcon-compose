package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CloudLightningFill: ImageVector
    get() {
        if (_CloudLightningFill != null) {
            return _CloudLightningFill!!
        }
        _CloudLightningFill = ImageVector.Builder(
            name = "Filled.CloudLightningFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 168f)
                horizontalLineTo(132.53f)
                lineToRelative(-14.4f, 24f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.86f, 12.12f)
                lineToRelative(-24f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.72f, -8.24f)
                lineTo(129.87f, 208f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.86f, -12.12f)
                lineTo(113.87f, 168f)
                horizontalLineToRelative(-37f)
                curveTo(48.12f, 168f, 24.2f, 145.07f, 24f, 116.36f)
                arcTo(52.09f, 52.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.35f, 66.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4.78f)
                arcTo(92.48f, 92.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 87.39f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 71.41f, 96f)
                lineToRelative(0.6f, 0f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.08f, -7.72f)
                arcTo(76f, 76f, 0f, isMoreThanHalf = true, isPositiveArc = true, 156f, 168f)
                close()
            }
        }.build()

        return _CloudLightningFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLightningFill: ImageVector? = null
