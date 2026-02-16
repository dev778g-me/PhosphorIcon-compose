package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MusicNotesPlusFill: ImageVector
    get() {
        if (_MusicNotesPlusFill != null) {
            return _MusicNotesPlusFill!!
        }
        _MusicNotesPlusFill = ImageVector.Builder(
            name = "Filled.MusicNotesPlusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(208f, 56f)
                lineTo(208f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(192f, 56f)
                lineTo(176f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                lineTo(192f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(208f, 40f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 48f)
                close()
                moveTo(160.6f, 77.86f)
                lineToRelative(-6.76f, -6.76f)
                arcTo(32.85f, 32.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 49.33f)
                arcToRelative(31.87f, 31.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, -11.66f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.76f, -5.14f)
                lineTo(78.06f, 48.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 56f)
                lineTo(72f, 166.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 52.42f, 232f)
                curveTo(72.25f, 231.77f, 88f, 215.13f, 88f, 195.3f)
                lineTo(88f, 102.25f)
                lineToRelative(70.74f, -17.69f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160.6f, 77.86f)
                close()
                moveTo(210.71f, 102.17f)
                arcToRelative(31.91f, 31.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.14f, 1.63f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.57f, 4f)
                lineTo(200f, 134.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 180.42f, 200f)
                curveToRelative(19.83f, -0.23f, 35.58f, -16.86f, 35.58f, -36.7f)
                lineTo(216f, 106f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 210.71f, 102.17f)
                close()
            }
        }.build()

        return _MusicNotesPlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNotesPlusFill: ImageVector? = null
