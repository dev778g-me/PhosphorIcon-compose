package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FoldersFill: ImageVector
    get() {
        if (_FoldersFill != null) {
            return _FoldersFill!!
        }
        _FoldersFill = ImageVector.Builder(
            name = "Filled.FoldersFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 64f)
                lineTo(154.67f, 64f)
                lineTo(126.93f, 43.2f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.6f, -3.2f)
                lineTo(72f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
                lineTo(56f, 72f)
                lineTo(40f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 88f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(192.89f, 216f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 200.89f)
                lineTo(208f, 184f)
                horizontalLineToRelative(16.89f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 168.89f)
                lineTo(240f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 64f)
                close()
                moveTo(224f, 168f)
                lineTo(208f, 168f)
                lineTo(208f, 112f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(122.67f, 96f)
                lineTo(94.93f, 75.2f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.6f, -3.2f)
                lineTo(72f, 72f)
                lineTo(72f, 56f)
                horizontalLineToRelative(45.33f)
                lineTo(147.2f, 78.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 80f)
                horizontalLineToRelative(72f)
                close()
            }
        }.build()

        return _FoldersFill!!
    }

@Suppress("ObjectPropertyName")
private var _FoldersFill: ImageVector? = null
