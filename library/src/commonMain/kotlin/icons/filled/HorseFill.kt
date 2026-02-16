package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HorseFill: ImageVector
    get() {
        if (_HorseFill != null) {
            return _HorseFill!!
        }
        _HorseFill = ImageVector.Builder(
            name = "Filled.HorseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(202.05f, 55f)
                arcTo(103.24f, 103.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(59.53f)
                lineTo(11.81f, 121.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.59f, 11.05f)
                lineToRelative(13.78f, 22f)
                lineToRelative(0.3f, 0.43f)
                arcToRelative(31.84f, 31.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.34f, 12.83f)
                curveToRelative(13.93f, -2.36f, 38.62f, -6.54f, 61.4f, 3.29f)
                lineToRelative(-26.6f, 36.57f)
                arcTo(84.71f, 84.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.34f, 194f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 58.67f, 206f)
                arcToRelative(103.32f, 103.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 69.26f, 26f)
                lineToRelative(2.17f, 0f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -177f)
                close()
                moveTo(124f, 112f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 112f)
                close()
            }
        }.build()

        return _HorseFill!!
    }

@Suppress("ObjectPropertyName")
private var _HorseFill: ImageVector? = null
