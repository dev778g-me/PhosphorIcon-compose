package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LampPendantFill: ImageVector
    get() {
        if (_LampPendantFill != null) {
            return _LampPendantFill!!
        }
        _LampPendantFill = ImageVector.Builder(
            name = "Filled.LampPendantFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 74.78f)
                verticalLineTo(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(136f)
                verticalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineTo(56f)
                horizontalLineTo(96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 72f)
                verticalLineToRelative(2.78f)
                arcTo(111.73f, 111.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(88f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 0f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                arcTo(111.73f, 111.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 74.78f)
                close()
                moveTo(128f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                horizontalLineToRelative(48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                close()
            }
        }.build()

        return _LampPendantFill!!
    }

@Suppress("ObjectPropertyName")
private var _LampPendantFill: ImageVector? = null
