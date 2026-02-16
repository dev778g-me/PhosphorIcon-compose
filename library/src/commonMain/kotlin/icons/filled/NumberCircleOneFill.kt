package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberCircleOneFill: ImageVector
    get() {
        if (_NumberCircleOneFill != null) {
            return _NumberCircleOneFill!!
        }
        _NumberCircleOneFill = ImageVector.Builder(
            name = "Filled.NumberCircleOneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(140f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(124f, 95f)
                lineToRelative(-11.56f, 7.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.88f, -13.32f)
                lineToRelative(24f, -16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 80f)
                close()
            }
        }.build()

        return _NumberCircleOneFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleOneFill: ImageVector? = null
