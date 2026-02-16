package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowArcLeftFill: ImageVector
    get() {
        if (_ArrowArcLeftFill != null) {
            return _ArrowArcLeftFill!!
        }
        _ArrowArcLeftFill = ImageVector.Builder(
            name = "Filled.ArrowArcLeftFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.47f, 120.16f)
                lineToRelative(26.19f, 26.18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 160f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(26.48f, 26.48f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 184f)
                close()
            }
        }.build()

        return _ArrowArcLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcLeftFill: ImageVector? = null
