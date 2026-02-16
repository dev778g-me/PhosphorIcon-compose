package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserFill: ImageVector
    get() {
        if (_UserFill != null) {
            return _UserFill!!
        }
        _UserFill = ImageVector.Builder(
            name = "Filled.UserFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.93f, 220f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.93f, 4f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.92f, -12f)
                curveToRelative(15.23f, -26.33f, 38.7f, -45.21f, 66.09f, -54.16f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 73.66f, 0f)
                curveToRelative(27.39f, 8.95f, 50.86f, 27.83f, 66.09f, 54.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230.93f, 220f)
                close()
            }
        }.build()

        return _UserFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserFill: ImageVector? = null
