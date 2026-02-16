package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CellSignalFullFill: ImageVector
    get() {
        if (_CellSignalFullFill != null) {
            return _CellSignalFullFill!!
        }
        _CellSignalFullFill = ImageVector.Builder(
            name = "Filled.CellSignalFullFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 40f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.7f, 188.68f)
                lineToRelative(160f, -160f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 40f)
                close()
            }
        }.build()

        return _CellSignalFullFill!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalFullFill: ImageVector? = null
