package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderUserFill: ImageVector
    get() {
        if (_FolderUserFill != null) {
            return _FolderUserFill!!
        }
        _FolderUserFill = ImageVector.Builder(
            name = "Filled.FolderUserFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.73f, 221.94f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 232f)
                horizontalLineTo(160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152.27f, 222f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.11f, -23.33f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 45.24f, 0f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.73f, 221.94f)
                close()
                moveTo(232f, 88f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(88f)
                horizontalLineTo(40f)
                verticalLineTo(200f)
                horizontalLineToRelative(80.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(39.38f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 200.62f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 44.69f)
                lineTo(131.31f, 72f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 88f)
                close()
                moveTo(108.69f, 72f)
                lineToRelative(-16f, -16f)
                horizontalLineTo(40f)
                verticalLineTo(72f)
                close()
            }
        }.build()

        return _FolderUserFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderUserFill: ImageVector? = null
