package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MusicNotesMinusFill: ImageVector
    get() {
        if (_MusicNotesMinusFill != null) {
            return _MusicNotesMinusFill!!
        }
        _MusicNotesMinusFill = ImageVector.Builder(
            name = "Filled.MusicNotesMinusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 40f)
                horizontalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(162.13f, 76.5f)
                arcToRelative(31.57f, 31.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.44f, -38.76f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 141f, 32.53f)
                lineTo(78.06f, 48.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 56f)
                verticalLineTo(166.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 52.42f, 232f)
                curveTo(72.25f, 231.77f, 88f, 215.13f, 88f, 195.3f)
                verticalLineTo(102.25f)
                lineToRelative(73.26f, -18.31f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 162.13f, 76.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(212f, 80f)
                horizontalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(50.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 180.42f, 200f)
                curveToRelative(19.83f, -0.23f, 35.58f, -16.86f, 35.58f, -36.7f)
                verticalLineTo(84f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 80f)
                close()
            }
        }.build()

        return _MusicNotesMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNotesMinusFill: ImageVector? = null
