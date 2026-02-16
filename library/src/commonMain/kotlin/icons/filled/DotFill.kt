package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DotFill: ImageVector
    get() {
        if (_DotFill != null) {
            return _DotFill!!
        }
        _DotFill = ImageVector.Builder(
            name = "Filled.DotFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 80f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 80f)
                close()
                moveTo(128f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                close()
            }
        }.build()

        return _DotFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotFill: ImageVector? = null
