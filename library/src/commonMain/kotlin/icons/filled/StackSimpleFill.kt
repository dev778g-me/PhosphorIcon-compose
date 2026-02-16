package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StackSimpleFill: ImageVector
    get() {
        if (_StackSimpleFill != null) {
            return _StackSimpleFill!!
        }
        _StackSimpleFill = ImageVector.Builder(
            name = "Filled.StackSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 111f)
                lineToRelative(112f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.94f, 0f)
                lineToRelative(112f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.9f)
                lineToRelative(-112f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.94f, 0f)
                lineToRelative(-112f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 111f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(236f, 137.05f)
                lineTo(128f, 198.79f)
                lineTo(20f, 137.05f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 151f)
                lineToRelative(112f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.94f, 0f)
                lineToRelative(112f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.94f, -13.9f)
                close()
            }
        }.build()

        return _StackSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _StackSimpleFill: ImageVector? = null
