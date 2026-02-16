package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PencilFill: ImageVector
    get() {
        if (_PencilFill != null) {
            return _PencilFill!!
        }
        _PencilFill = ImageVector.Builder(
            name = "Filled.PencilFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.31f, 73.37f)
                lineTo(182.63f, 28.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(36.69f, 152f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 163.31f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(92.69f, 224f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 219.31f)
                lineTo(227.31f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                close()
                moveTo(51.31f, 160f)
                lineToRelative(90.35f, -90.35f)
                lineToRelative(16.68f, 16.69f)
                lineTo(68f, 176.68f)
                close()
                moveTo(48f, 179.31f)
                lineTo(76.69f, 208f)
                lineTo(48f, 208f)
                close()
                moveTo(96f, 204.69f)
                lineTo(79.31f, 188f)
                lineToRelative(90.35f, -90.35f)
                horizontalLineToRelative(0f)
                lineToRelative(16.68f, 16.69f)
                close()
            }
        }.build()

        return _PencilFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilFill: ImageVector? = null
