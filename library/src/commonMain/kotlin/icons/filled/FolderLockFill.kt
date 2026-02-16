package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderLockFill: ImageVector
    get() {
        if (_FolderLockFill != null) {
            return _FolderLockFill!!
        }
        _FolderLockFill = ImageVector.Builder(
            name = "Filled.FolderLockFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 72f)
                lineTo(131.31f, 72f)
                lineTo(104f, 44.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.69f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200.62f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.38f, 216f)
                horizontalLineToRelative(73.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(40f, 200f)
                lineTo(40f, 88f)
                lineTo(216f, 88f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(232f, 88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(40f, 72f)
                lineTo(40f, 56f)
                lineTo(92.69f, 56f)
                lineToRelative(16f, 16f)
                close()
                moveTo(224f, 160f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(232f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 160f)
                close()
                moveTo(200f, 160f)
                lineTo(176f, 160f)
                verticalLineToRelative(-4f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 0f)
                close()
            }
        }.build()

        return _FolderLockFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLockFill: ImageVector? = null
