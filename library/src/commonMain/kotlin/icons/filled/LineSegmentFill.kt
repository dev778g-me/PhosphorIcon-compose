package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LineSegmentFill: ImageVector
    get() {
        if (_LineSegmentFill != null) {
            return _LineSegmentFill!!
        }
        _LineSegmentFill = ImageVector.Builder(
            name = "Filled.LineSegmentFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211.81f, 83.79f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.12f, 4.83f)
                lineTo(88.62f, 178.69f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44.43f, -6.48f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.12f, -4.83f)
                lineToRelative(90.07f, -90.07f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44.43f, 6.48f)
                close()
            }
        }.build()

        return _LineSegmentFill!!
    }

@Suppress("ObjectPropertyName")
private var _LineSegmentFill: ImageVector? = null
