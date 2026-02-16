package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderStarFill: ImageVector
    get() {
        if (_FolderStarFill != null) {
            return _FolderStarFill!!
        }
        _FolderStarFill = ImageVector.Builder(
            name = "Filled.FolderStarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.09f, 167.78f)
                lineToRelative(-22.51f, 18.59f)
                lineToRelative(6.85f, 27.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.82f, 8.81f)
                lineTo(184f, 207.82f)
                lineToRelative(-25.61f, 15.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.82f, -8.81f)
                lineToRelative(6.85f, -27.71f)
                lineToRelative(-22.51f, -18.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.47f, -14.14f)
                lineToRelative(29.84f, -2.31f)
                lineToRelative(11.43f, -26.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.7f, 0f)
                lineToRelative(11.43f, 26.5f)
                lineToRelative(29.84f, 2.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.47f, 14.14f)
                close()
                moveTo(128.56f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(39.38f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 200.62f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 44.69f)
                lineTo(131.31f, 72f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(88f)
                horizontalLineTo(40f)
                verticalLineTo(200f)
                horizontalLineToRelative(80.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128.56f, 208f)
                close()
                moveTo(40f, 72f)
                horizontalLineToRelative(68.69f)
                lineToRelative(-16f, -16f)
                horizontalLineTo(40f)
                close()
            }
        }.build()

        return _FolderStarFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStarFill: ImageVector? = null
