package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowsCounterClockwiseFill: ImageVector
    get() {
        if (_ArrowsCounterClockwiseFill != null) {
            return _ArrowsCounterClockwiseFill!!
        }
        _ArrowsCounterClockwiseFill = ImageVector.Builder(
            name = "Filled.ArrowsCounterClockwiseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 104f)
                lineTo(40f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(32f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineTo(64f, 60.7f)
                arcToRelative(95.42f, 95.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66f, -26.76f)
                horizontalLineToRelative(0.53f)
                arcToRelative(95.36f, 95.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.07f, 27.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.18f, 11.44f)
                arcToRelative(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -55.89f, -22.77f)
                horizontalLineToRelative(-0.45f)
                arcTo(79.48f, 79.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 75.35f, 72f)
                lineTo(93.66f, 90.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 104f)
                close()
                moveTo(216f, 152f)
                lineTo(168f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineTo(180.65f, 184f)
                arcToRelative(79.48f, 79.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -54.72f, 22.09f)
                horizontalLineToRelative(-0.45f)
                arcToRelative(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -55.89f, -22.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.18f, 11.44f)
                arcToRelative(95.36f, 95.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.07f, 27.33f)
                lineTo(126f, 222.09f)
                arcToRelative(95.42f, 95.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66f, -26.76f)
                lineToRelative(18.36f, 18.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 208f)
                lineTo(224f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 152f)
                close()
            }
        }.build()

        return _ArrowsCounterClockwiseFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsCounterClockwiseFill: ImageVector? = null
