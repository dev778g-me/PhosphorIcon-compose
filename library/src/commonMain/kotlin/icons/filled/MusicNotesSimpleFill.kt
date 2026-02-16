package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MusicNotesSimpleFill: ImageVector
    get() {
        if (_MusicNotesSimpleFill != null) {
            return _MusicNotesSimpleFill!!
        }
        _MusicNotesSimpleFill = ImageVector.Builder(
            name = "Filled.MusicNotesSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(212.92f, 17.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, -1.45f)
                lineToRelative(-128f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 56f)
                verticalLineTo(166.08f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 88f, 196f)
                verticalLineTo(62.25f)
                lineToRelative(112f, -28f)
                verticalLineToRelative(99.83f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 216f, 164f)
                verticalLineTo(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212.92f, 17.69f)
                close()
            }
        }.build()

        return _MusicNotesSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNotesSimpleFill: ImageVector? = null
