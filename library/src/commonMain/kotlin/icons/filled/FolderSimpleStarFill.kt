package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderSimpleStarFill: ImageVector
    get() {
        if (_FolderSimpleStarFill != null) {
            return _FolderSimpleStarFill!!
        }
        _FolderSimpleStarFill = ImageVector.Builder(
            name = "Filled.FolderSimpleStarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                lineTo(93.33f, 48f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 3.2f)
                lineTo(130.67f, 72f)
                lineTo(216f, 72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(216f, 88f)
                lineTo(128f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.8f, -1.6f)
                lineTo(93.33f, 64f)
                lineTo(40f, 64f)
                lineTo(40f, 200f)
                horizontalLineToRelative(80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                close()
                moveTo(239.63f, 159.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -5.56f)
                lineToRelative(-29.84f, -2.31f)
                lineToRelative(-11.43f, -26.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.7f, 0f)
                lineToRelative(-11.43f, 26.5f)
                lineToRelative(-29.84f, 2.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.47f, 14.14f)
                lineToRelative(22.51f, 18.59f)
                lineToRelative(-6.85f, 27.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.82f, 8.81f)
                lineTo(184f, 207.82f)
                lineToRelative(25.61f, 15.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.82f, -8.81f)
                lineToRelative(-6.85f, -27.71f)
                lineToRelative(22.51f, -18.59f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.63f, 159.2f)
                close()
            }
        }.build()

        return _FolderSimpleStarFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSimpleStarFill: ImageVector? = null
