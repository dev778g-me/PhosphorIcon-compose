package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderSimpleUserFill: ImageVector
    get() {
        if (_FolderSimpleUserFill != null) {
            return _FolderSimpleUserFill!!
        }
        _FolderSimpleUserFill = ImageVector.Builder(
            name = "Filled.FolderSimpleUserFill",
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
                moveTo(216f, 72f)
                horizontalLineTo(130.67f)
                lineTo(102.93f, 51.2f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.6f, -3.2f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(40f)
                verticalLineTo(64f)
                horizontalLineTo(93.33f)
                lineToRelative(27.74f, 20.8f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.6f, 3.2f)
                horizontalLineTo(216f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
            }
        }.build()

        return _FolderSimpleUserFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSimpleUserFill: ImageVector? = null
