package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberCircleNineFill: ImageVector
    get() {
        if (_NumberCircleNineFill != null) {
            return _NumberCircleNineFill!!
        }
        _NumberCircleNineFill = ImageVector.Builder(
            name = "Filled.NumberCircleNineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(145.33f, 118f)
                lineToRelative(0f, 0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 138f, 90.68f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 145.31f, 118f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(146f, 76.82f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 127.94f, 144f)
                quadToRelative(0.94f, 0f, 1.89f, -0.06f)
                lineToRelative(-16.7f, 28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.77f, 11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, -2.77f)
                lineTo(159.18f, 126f)
                arcTo(36.05f, 36.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 146f, 76.82f)
                close()
            }
        }.build()

        return _NumberCircleNineFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleNineFill: ImageVector? = null
