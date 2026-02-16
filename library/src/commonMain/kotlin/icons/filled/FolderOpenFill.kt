package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderOpenFill: ImageVector
    get() {
        if (_FolderOpenFill != null) {
            return _FolderOpenFill!!
        }
        _FolderOpenFill = ImageVector.Builder(
            name = "Filled.FolderOpenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245f, 110.64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 104f)
                horizontalLineTo(216f)
                verticalLineTo(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(130.67f)
                lineTo(102.94f, 51.2f)
                arcToRelative(16.14f, 16.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.6f, -3.2f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                verticalLineTo(208f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(211.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.59f, -5.47f)
                lineToRelative(28.49f, -85.47f)
                arcTo(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 245f, 110.64f)
                close()
                moveTo(93.34f, 64f)
                lineTo(123.2f, 86.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 88f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(16f)
                horizontalLineTo(69.77f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.18f, 10.94f)
                lineTo(40f, 158.7f)
                verticalLineTo(64f)
                close()
            }
        }.build()

        return _FolderOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpenFill: ImageVector? = null
