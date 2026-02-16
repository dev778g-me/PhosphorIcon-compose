package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HighlighterFill: ImageVector
    get() {
        if (_HighlighterFill != null) {
            return _HighlighterFill!!
        }
        _HighlighterFill = ImageVector.Builder(
            name = "Filled.HighlighterFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(253.66f, 106.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineTo(192f, 156.69f)
                lineTo(107.31f, 72f)
                lineToRelative(50.35f, -50.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(96f, 60.69f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93.18f, 79.5f)
                lineTo(72f, 100.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.62f)
                lineTo(76.69f, 128f)
                lineTo(18.34f, 186.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.13f, 13.25f)
                lineToRelative(72f, 24f)
                arcTo(7.88f, 7.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                lineTo(136f, 187.31f)
                lineToRelative(4.69f, 4.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 0f)
                lineToRelative(21.18f, -21.18f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 203.31f, 168f)
                lineToRelative(50.35f, -50.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 253.66f, 106.34f)
                close()
                moveTo(152f, 180.69f)
                lineTo(83.31f, 112f)
                lineTo(104f, 91.31f)
                lineTo(172.69f, 160f)
                close()
            }
        }.build()

        return _HighlighterFill!!
    }

@Suppress("ObjectPropertyName")
private var _HighlighterFill: ImageVector? = null
