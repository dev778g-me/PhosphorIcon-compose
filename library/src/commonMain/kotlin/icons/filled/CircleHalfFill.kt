package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CircleHalfFill: ImageVector
    get() {
        if (_CircleHalfFill != null) {
            return _CircleHalfFill!!
        }
        _CircleHalfFill = ImageVector.Builder(
            name = "Filled.CircleHalfFill",
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
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, -88f)
                verticalLineTo(216f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 128f)
                close()
            }
        }.build()

        return _CircleHalfFill!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHalfFill: ImageVector? = null
