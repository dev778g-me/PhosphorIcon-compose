package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowsClockwiseFill: ImageVector
    get() {
        if (_ArrowsClockwiseFill != null) {
            return _ArrowsClockwiseFill!!
        }
        _ArrowsClockwiseFill = ImageVector.Builder(
            name = "Filled.ArrowsClockwiseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 48f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineTo(180.65f, 72f)
                arcToRelative(79.48f, 79.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -54.72f, -22.09f)
                horizontalLineToRelative(-0.45f)
                arcTo(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 69.59f, 72.71f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.41f, 61.27f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 60.7f)
                lineToRelative(18.36f, -18.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(186.41f, 183.29f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 75.35f, 184f)
                lineToRelative(18.31f, -18.31f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 152f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineTo(64f, 195.3f)
                arcToRelative(95.42f, 95.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66f, 26.76f)
                horizontalLineToRelative(0.53f)
                arcToRelative(95.36f, 95.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.07f, -27.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.18f, -11.44f)
                close()
            }
        }.build()

        return _ArrowsClockwiseFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsClockwiseFill: ImageVector? = null
