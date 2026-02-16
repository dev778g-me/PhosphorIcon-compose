package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderSimpleFill: ImageVector
    get() {
        if (_FolderSimpleFill != null) {
            return _FolderSimpleFill!!
        }
        _FolderSimpleFill = ImageVector.Builder(
            name = "Filled.FolderSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 88f)
                verticalLineTo(200.89f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216.89f, 216f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                horizontalLineTo(93.33f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 3.2f)
                lineTo(130.67f, 72f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 88f)
                close()
            }
        }.build()

        return _FolderSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSimpleFill: ImageVector? = null
