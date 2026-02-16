package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MusicNotesFill: ImageVector
    get() {
        if (_MusicNotesFill != null) {
            return _MusicNotesFill!!
        }
        _MusicNotesFill = ImageVector.Builder(
            name = "Filled.MusicNotesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(212.92f, 17.71f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, -1.46f)
                lineToRelative(-128f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 56f)
                verticalLineTo(166.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 88f, 196f)
                verticalLineTo(102.25f)
                lineToRelative(112f, -28f)
                verticalLineTo(134.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 216f, 164f)
                verticalLineTo(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212.92f, 17.71f)
                close()
            }
        }.build()

        return _MusicNotesFill!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNotesFill: ImageVector? = null
