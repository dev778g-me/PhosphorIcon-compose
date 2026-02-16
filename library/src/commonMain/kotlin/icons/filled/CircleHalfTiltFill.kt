package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CircleHalfTiltFill: ImageVector
    get() {
        if (_CircleHalfTiltFill != null) {
            return _CircleHalfTiltFill!!
        }
        _CircleHalfTiltFill = ImageVector.Builder(
            name = "Filled.CircleHalfTiltFill",
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
                moveTo(40f, 128f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 190.2f, 65.8f)
                lineTo(65.8f, 190.2f)
                arcTo(87.76f, 87.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 128f)
                close()
            }
        }.build()

        return _CircleHalfTiltFill!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHalfTiltFill: ImageVector? = null
