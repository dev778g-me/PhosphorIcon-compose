package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FolderMinusFill: ImageVector
    get() {
        if (_FolderMinusFill != null) {
            return _FolderMinusFill!!
        }
        _FolderMinusFill = ImageVector.Builder(
            name = "Filled.FolderMinusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 72f)
                lineTo(131.31f, 72f)
                lineTo(104f, 44.69f)
                arcTo(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.69f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200.62f)
                arcTo(15.41f, 15.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.39f, 216f)
                horizontalLineToRelative(177.5f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 200.89f)
                lineTo(232f, 88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(40f, 56f)
                lineTo(92.69f, 56f)
                lineToRelative(16f, 16f)
                lineTo(40f, 72f)
                close()
                moveTo(152f, 152f)
                lineTo(104f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _FolderMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMinusFill: ImageVector? = null
