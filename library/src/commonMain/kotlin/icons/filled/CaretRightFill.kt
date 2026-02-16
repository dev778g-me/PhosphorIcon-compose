package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CaretRightFill: ImageVector
    get() {
        if (_CaretRightFill != null) {
            return _CaretRightFill!!
        }
        _CaretRightFill = ImageVector.Builder(
            name = "Filled.CaretRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(181.66f, 122.34f)
                lineToRelative(-80f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 48f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineToRelative(80f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 181.66f, 122.34f)
                close()
            }
        }.build()

        return _CaretRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRightFill: ImageVector? = null
