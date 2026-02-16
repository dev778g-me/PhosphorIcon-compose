package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChatsTeardropFill: ImageVector
    get() {
        if (_ChatsTeardropFill != null) {
            return _ChatsTeardropFill!!
        }
        _ChatsTeardropFill = ImageVector.Builder(
            name = "Filled.ChatsTeardropFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(169.57f, 72.59f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 104f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(86.67f)
                arcTo(80.15f, 80.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 232f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(152f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 169.57f, 72.59f)
                close()
                moveTo(224f, 216f)
                horizontalLineTo(160f)
                arcToRelative(64.14f, 64.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -55.68f, -32.43f)
                arcTo(79.93f, 79.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 174.7f, 89.71f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 152f)
                close()
            }
        }.build()

        return _ChatsTeardropFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatsTeardropFill: ImageVector? = null
