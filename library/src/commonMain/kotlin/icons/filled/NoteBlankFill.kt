package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NoteBlankFill: ImageVector
    get() {
        if (_NoteBlankFill != null) {
            return _NoteBlankFill!!
        }
        _NoteBlankFill = ImageVector.Builder(
            name = "Filled.NoteBlankFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(156.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 219.31f)
                lineTo(219.31f, 168f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 156.69f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(160f, 204.69f)
                verticalLineTo(160f)
                horizontalLineToRelative(44.69f)
                close()
            }
        }.build()

        return _NoteBlankFill!!
    }

@Suppress("ObjectPropertyName")
private var _NoteBlankFill: ImageVector? = null
