package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CircleFill: ImageVector
    get() {
        if (_CircleFill != null) {
            return _CircleFill!!
        }
        _CircleFill = ImageVector.Builder(
            name = "Filled.CircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-104f, 0f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 208f, 0f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, -208f, 0f)
            }
        }.build()

        return _CircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CircleFill: ImageVector? = null
