package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BookmarkFill: ImageVector
    get() {
        if (_BookmarkFill != null) {
            return _BookmarkFill!!
        }
        _BookmarkFill = ImageVector.Builder(
            name = "Filled.BookmarkFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 32f)
                horizontalLineTo(72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 48f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.24f, 6.78f)
                lineTo(128f, 193.43f)
                lineToRelative(59.77f, 37.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 224f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 32f)
                close()
                moveTo(132.23f, 177.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.48f, 0f)
                lineTo(72f, 209.57f)
                verticalLineTo(180.43f)
                lineToRelative(56f, -35f)
                lineToRelative(56f, 35f)
                verticalLineToRelative(29.14f)
                close()
            }
        }.build()

        return _BookmarkFill!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkFill: ImageVector? = null
